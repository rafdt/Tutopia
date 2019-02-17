/*
 * Copyright (c) 2018 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.whysoserious.ui.profile

import android.app.Activity.RESULT_OK
import android.content.ContentResolver
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.ActivityCompat.startActivityForResult
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat.startActivity
import android.text.TextUtils.lastIndexOf
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.MimeTypeMap
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.android.gms.tasks.Task
import com.google.firebase.database.DatabaseReference

import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.UploadTask
import com.raywenderlich.android.whysoserious.R
import com.raywenderlich.android.whysoserious.Upload
import com.raywenderlich.android.whysoserious.common.onClick
import com.raywenderlich.android.whysoserious.model.Joke
import com.raywenderlich.android.whysoserious.model.User
import com.raywenderlich.android.whysoserious.profilePresenter
import com.raywenderlich.android.whysoserious.ui.jokes.all.list.JokeHolder
import com.raywenderlich.android.whysoserious.ui.welcome.WelcomeActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kotlinx.android.synthetic.main.item_joke.*
import kotlinx.android.synthetic.main.item_joke.view.*
import java.io.File
import java.lang.Exception

class ProfileFragment : Fragment(), ProfileView {
  private val PICK_IMAGE_REQUEST = 1
  var user = ""
  var isChosen = false
    var numtimes = 1
  private lateinit var database: DatabaseReference
  var myUri: Uri = Uri.parse("http://google.com");

  private fun getFileExtension():String{

    val cR = context!!.contentResolver
    val mime = MimeTypeMap.getSingleton().getExtensionFromMimeType(cR.getType(myUri))
    return mime
  }

  private fun uploadFile(){
    if(myUri != null){
      Toast.makeText(context, "upload been pressed",Toast.LENGTH_LONG ).show()

      val fileReference: StorageReference = FirebaseStorage.getInstance().getReference("uploads").child(
              user+ "." + getFileExtension())
      fileReference.putFile(myUri).addOnSuccessListener {
        fun onSuccess(){
          Toast.makeText(context,"DONEZO", Toast.LENGTH_LONG).show()

          var handler:Handler = Handler()
          handler.postDelayed(Runnable {

          },10000)
          Toast.makeText(context,"Upload successful", Toast.LENGTH_LONG).show()
          val uploadID = database.push().getKey()
          database.child(uploadID).setValue(userName.toString())

        }
      }.addOnFailureListener(
        fun(exception: Exception){
          Toast.makeText(context,exception.message, Toast.LENGTH_LONG).show()

      }).addOnProgressListener {
        Toast.makeText(context,"progression!", Toast.LENGTH_LONG).show()

      }
    }else{
      Toast.makeText(context,"No file selected", Toast.LENGTH_LONG ).show()
    }


  }


  private val presenter by lazy { profilePresenter() }
  fun openFileChooser(){
    val intent = Intent()
    intent.type = "image/*"
    intent.action = Intent.ACTION_GET_CONTENT
    startActivityForResult(intent, PICK_IMAGE_REQUEST)
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null
    && data.data != null){
      myUri = data.data
      Log.d("thing",data.data.toString())
      userPic.setImageURI(myUri)
      isChosen = true
              //Picasso.with(this).load(myUri).into(profile_image)
    }

  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_profile, container, false)


  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    presenter.setView(this)
    initUi()
    database = FirebaseDatabase.getInstance().reference
    presenter.getProfile()
  }

  private fun initUi() {
    logoutButton.onClick { presenter.logOut() }
    profile_image.onClick {
      openFileChooser()
    }
    uploadBtn.onClick {
      if(isChosen){
        uploadFile()
      }else{
        Toast.makeText(context,"please upload a photo first!",Toast.LENGTH_LONG).show()
      }
    }
  }

  override fun showUsername(username: String) {
    userName.text = getString(R.string.username_text, username)
    user = userName.text.toString().substring(userName.text.toString().lastIndexOf(": ")+2)
  }

  override fun showEmail(email: String) {
    userEmail.text = getString(R.string.email_text, email)
  }

  override fun showNumberOfJokes(jokesCount: Int) {
    numberOfJokes.text = getString(R.string.number_of_jokes_text, jokesCount)
  }

  override fun openWelcome() {
    startActivity(Intent(activity, WelcomeActivity::class.java))
    activity?.finish()
  }

    /*fun show_profile(user: String, view: View) {
        val nameAuthor = user
        val storage = FirebaseStorage.getInstance()
        val storageRef = storage.reference
        val pathReference = storageRef.child("uploads/" + nameAuthor + ".jpg")
        Toast.makeText(context, pathReference.toString(), Toast.LENGTH_LONG).show()
        val ONE_MEGABYTE = (1024 * 1024 * 5).toLong()
        pathReference.getBytes(ONE_MEGABYTE).addOnSuccessListener { bytes ->
            val bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            view.findViewById<ImageView>(R.id.userPic).setImageBitmap(bmp)
        }

    }*/

}


