package kz.assylkhanov.mvvm.data

import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
interface Repository {

    fun getFeed(): List<Post>
}
