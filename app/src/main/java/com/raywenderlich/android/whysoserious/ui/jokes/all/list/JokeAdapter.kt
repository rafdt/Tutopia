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

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.raywenderlich.android.whysoserious.R
import com.raywenderlich.android.whysoserious.model.Joke

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
   Glide.with(parent.context)
           .load("https://firebasestorage.googleapis.com/v0/b/why-so-serious-49ff6.appspot.com/o/uploads%2Fhelloworld.jpg?alt=media&token=d20de023-6629-4252-9197-e3de00829244")
           .into(view.findViewById<ImageView>(R.id.tutorPic))
    return JokeHolder(view, onFavoriteClickHandler)
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