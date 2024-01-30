package kz.assylkhanov.mvvm

import kz.assylkhanov.mvvm.examples.Presenter
import kz.assylkhanov.mvvm.examples.RepositoryTestImpl

/**
 * @author a.asylkhanov
 */
class PresenterTest {
    fun preparePresenterForTest() {
        val mockRepository = RepositoryTestImpl()
        Presenter(mockRepository).getFeed()

        assert(mockRepository.getFeedCounter == 1)
    }
}
