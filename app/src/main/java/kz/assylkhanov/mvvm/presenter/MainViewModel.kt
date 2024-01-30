package kz.assylkhanov.mvvm.presenter

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kz.assylkhanov.mvvm.domain.AddPostUseCase
import kz.assylkhanov.mvvm.domain.GetFeedUseCase
import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
class MainViewModel(
    private val getFeedUseCase: GetFeedUseCase,
    private val addPostUseCase: AddPostUseCase,
) : ViewModel() {

    val posts: MutableLiveData<List<Post>> = MutableLiveData(emptyList())

    init {
        getPosts()
    }

    fun onUpdateEvent() {
        getPosts()
    }

    fun onCreatePostClick() {
        val post = Post(0, getRandomString(10))
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                addPostUseCase.invoke(post)
            }
        }
    }

    private fun getPosts() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                getFeedUseCase.invoke().collect {
                    Log.e("VM", it.toString())
                }

            }
        }
    }

    fun getRandomString(length: Int) : String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }


}
