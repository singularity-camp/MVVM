package kz.assylkhanov.mvvm.examples

import kz.assylkhanov.mvvm.data.Repository

/**
 * @author a.asylkhanov
 */
class Presenter(private val repository: Repository) {

    fun getFeed() {
        repository.getFeed()
    }
}
