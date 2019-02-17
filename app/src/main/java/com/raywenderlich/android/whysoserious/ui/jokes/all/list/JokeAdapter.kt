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

package com.raywenderlich.android.whysoserious.ui.jokes.all.list

import android.graphics.BitmapFactory
import android.media.Image
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.android.gms.tasks.Task
import com.google.firebase.storage.FirebaseStorage
import com.raywenderlich.android.whysoserious.R
import com.raywenderlich.android.whysoserious.model.Joke
import java.io.File

class JokeAdapter(
    private val onFavoriteClickHandler: (Joke) -> Unit
) : RecyclerView.Adapter<JokeHolder>() {

  private val items = mutableListOf<Joke>()
  private val favoriteJokesIds = mutableListOf<String>()

  override fun getItemCount() = items.size

  fun setFavoriteJokesIds(ids: List<String>) {
    favoriteJokesIds.clear()
    favoriteJokesIds.addAll(ids)
    notifyDataSetChanged()
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_joke, parent, false)

      setPics(parent,view)
      return JokeHolder(view, onFavoriteClickHandler)
  }

    fun setPics(parent: ViewGroup, view:View){
        for (item in items){
            val nameAuthor = item.authorName
            val storage = FirebaseStorage.getInstance()
            val storageRef = storage.reference
            val pathReference = storageRef.child("uploads/"+nameAuthor+".jpg")
            Toast.makeText(parent.context, pathReference.toString(), Toast.LENGTH_LONG).show()
            val ONE_MEGABYTE = (1024*1024*5).toLong()
            pathReference.getBytes(ONE_MEGABYTE).addOnSuccessListener {bytes->
                val bmp = BitmapFactory.decodeByteArray(bytes,0,bytes.size)
                view.findViewById<ImageView>(R.id.tutorPic).setImageBitmap(bmp)
                Log.d("author name", nameAuthor)
            }.addOnFailureListener {
                Toast.makeText(parent.context,"oh no ", Toast.LENGTH_LONG).show()
            }
        }

    }
  override fun onBindViewHolder(holder: JokeHolder, position: Int) {
    val joke = items[position].apply { isFavorite = id in favoriteJokesIds }

    holder.displayData(joke)
  }

  fun addJoke(joke: Joke) {
    items.add(joke)
    notifyItemInserted(items.size - 1)
  }
}