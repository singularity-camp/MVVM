package kz.assylkhanov.mvvm.presenter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kz.assylkhanov.mvvm.domain.GetFeedUseCase
import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
class MainViewModel(private val getFeedUseCase: GetFeedUseCase) : ViewModel() {

    val posts: MutableLiveData<List<Post>> = MutableLiveData(emptyList())

    init {
        getPosts()
    }

    fun onUpdateEvent() {
        getPosts()
    }

    private fun getPosts() {
        val result = getFeedUseCase.invoke()
        posts.value = result
    }

}
