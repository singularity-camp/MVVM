package kz.assylkhanov.mvvm.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kz.assylkhanov.mvvm.data.db.PostDao
import kz.assylkhanov.mvvm.data.mapper.PostsMapper
import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
class RepositoryImpl(
    private val postDao: PostDao,
    private val postsMapper: PostsMapper
) : Repository {
    //val data = listOf(Post(1, "Absolutely Real Post"), Post(2, "Second Absolutely Real Post"))

    override suspend fun getFeed(): Flow<List<Post>> {
        return postDao.getAllPosts().map { postEntities ->
            postEntities.map { postsMapper.fromEntityToDomain(it) }
        }
    }

    override suspend fun addPost(post: Post) {
        val postEntity = postsMapper.fromDomainToEntity(post)
        postDao.addPost(postEntity)
    }
}
