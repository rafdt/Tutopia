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

import com.raywenderlich.android.whysoserious.common.arePasswordsSame
import com.raywenderlich.android.whysoserious.common.isEmailValid
import com.raywenderlich.android.whysoserious.common.isPasswordValid
import com.raywenderlich.android.whysoserious.common.isUsernameValid
import com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface
import com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface
import com.raywenderlich.android.whysoserious.model.RegisterRequest
import com.raywenderlich.android.whysoserious.presentation.RegisterPresenter
import com.raywenderlich.android.whysoserious.ui.register.RegisterView
import javax.inject.Inject

class RegisterPresenterImpl @Inject constructor(
    private val database: FirebaseDatabaseInterface,
    private val authentication: FirebaseAuthenticationInterface) : RegisterPresenter {

  private lateinit var view: RegisterView

  private val userData = RegisterRequest()

  override fun setView(view: RegisterView) {
    this.view = view
  }

  override fun onUsernameChanged(username: String) {
    userData.name = username

    if (!isUsernameValid(username)) {
      view.showUsernameError()
    }
  }

  override fun onEmailChanged(email: String) {
    userData.email = email

    if (!isEmailValid(email)) {
      view.showEmailError()
    }
  }

  override fun onPasswordChanged(password: String) {
    userData.password = password

    if (!isPasswordValid(password)) {
      view.showPasswordError()
    }
  }

  override fun onRepeatPasswordChanged(repeatPassword: String) {
    userData.repeatPassword = repeatPassword

    if (!arePasswordsSame(userData.password, repeatPassword)) {
      view.showPasswordMatchingError()
    }
  }

  override fun onRegisterTapped() {
    if (userData.isValid()) {
      val (name, email, password) = userData

      authentication.register(email, password, name) { isSuccessful ->
        onRegisterResult(isSuccessful, name, email)
      }
    }
  }

  private fun onRegisterResult(isSuccessful: Boolean, name: String, email: String) {
    if (isSuccessful) {
      createUser(name, email)
      view.onRegisterSuccess()
    } else {
      view.showSignUpError()
    }
  }

  private fun createUser(name: String, email: String) {
    val id = authentication.getUserId()

    database.createUser(id, name, email)
  }
}

