package kz.assylkhanov.mvvm.data

import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
class RepositoryImpl : Repository {
    val data = listOf(Post(1, "Absolutely Real Post"), Post(2, "Second Absolutely Real Post"))

    override fun getFeed(): List<Post> {
        return data
    }
}
