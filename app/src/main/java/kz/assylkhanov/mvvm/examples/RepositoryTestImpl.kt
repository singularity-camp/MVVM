package kz.assylkhanov.mvvm.examples

import kz.assylkhanov.mvvm.data.Repository
import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
class RepositoryTestImpl : Repository {
    var getFeedCounter = 0
    override fun getFeed(): List<Post> {
        getFeedCounter++
        return emptyList()
    }
}
