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

import com.raywenderlich.android.whysoserious.common.isValidJoke
import com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface
import com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface
import com.raywenderlich.android.whysoserious.model.Joke
import com.raywenderlich.android.whysoserious.presentation.AddJokePresenter
import com.raywenderlich.android.whysoserious.ui.addJoke.AddJokeView
import javax.inject.Inject

class AddJokePresenterImpl @Inject constructor(
    private val authenticationInterface: FirebaseAuthenticationInterface,
    private val databaseInterface: FirebaseDatabaseInterface
) : AddJokePresenter {

  private lateinit var view: AddJokeView

  private var jokeText = ""

  override fun setView(view: AddJokeView) {
    this.view = view
  }

  override fun addJokeTapped() {
    if (isValidJoke(jokeText)) {
      val joke = Joke("", authenticationInterface.getUserName(), authenticationInterface.getUserId(), jokeText)

      databaseInterface.addNewJoke(joke) { onAddJokeResult(it) }
    }
  }

  override fun onJokeTextChanged(jokeText: String) {
    this.jokeText = jokeText

    if (!isValidJoke(jokeText)) {
      view.showJokeError()
    } else {
      view.removeJokeError()
    }
  }

  private fun onAddJokeResult(isSuccessful: Boolean) {
    if (isSuccessful) {
      view.onJokeAdded()
    } else {
      view.showAddJokeError()
    }
  }
}