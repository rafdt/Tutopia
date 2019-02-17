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

package com.raywenderlich.android.whysoserious.firebase.authentication

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import javax.inject.Inject

class FirebaseAuthenticationManager @Inject constructor(private val authentication: FirebaseAuth) : FirebaseAuthenticationInterface {

  override fun login(email: String, password: String, onResult: (Boolean) -> Unit) {
    authentication.signInWithEmailAndPassword(email, password).addOnCompleteListener {
      onResult(it.isComplete && it.isSuccessful)
    }
  }

  override fun register(email: String, password: String, userName: String, onResult: (Boolean) -> Unit) {
    authentication.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
      if (it.isComplete && it.isSuccessful) {
        authentication.currentUser?.updateProfile(UserProfileChangeRequest
            .Builder()
            .setDisplayName(userName)
            .build())

        onResult(true)
      } else {
        onResult(false)
      }
    }
  }

  override fun getUserId(): String = authentication.currentUser?.uid ?: ""
  override fun getUserName(): String = authentication.currentUser?.displayName ?: ""

  override fun logOut(onResult: () -> Unit) {
    authentication.signOut()

    onResult()
  }
}