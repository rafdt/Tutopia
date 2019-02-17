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

package com.raywenderlich.android.whysoserious.presentation.implementation

import com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface
import com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface
import com.raywenderlich.android.whysoserious.presentation.ProfilePresenter
import com.raywenderlich.android.whysoserious.ui.profile.ProfileView
import javax.inject.Inject

class ProfilePresenterImpl @Inject constructor(
    private val authenticationInterface: FirebaseAuthenticationInterface,
    private val databaseInterface: FirebaseDatabaseInterface
) : ProfilePresenter {

  private lateinit var view: ProfileView

  override fun setView(view: ProfileView) {
    this.view = view
  }

  override fun getProfile() {
    databaseInterface.getProfile(authenticationInterface.getUserId()) {
      val userId = authenticationInterface.getUserId()

      view.showUsername(it.username)
      view.showEmail(it.email)
      view.showNumberOfJokes(it.favoriteJokes.count { it.authorId==userId })
    }
  }

  override fun logOut() = authenticationInterface.logOut { view.openWelcome() }
}