package kz.assylkhanov.mvvm.data

import kotlinx.coroutines.flow.Flow
import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
interface Repository {

    suspend fun getFeed(): Flow<List<Post>>

    suspend fun addPost(post: Post)
}
