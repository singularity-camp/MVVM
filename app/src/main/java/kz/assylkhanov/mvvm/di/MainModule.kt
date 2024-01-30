package kz.assylkhanov.mvvm.di

import kz.assylkhanov.mvvm.data.GetFeedUseCaseImpl
import kz.assylkhanov.mvvm.data.Repository
import kz.assylkhanov.mvvm.data.RepositoryImpl
import kz.assylkhanov.mvvm.domain.GetFeedUseCase
import kz.assylkhanov.mvvm.presenter.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * @author a.asylkhanov
 */

val mainModule = module {
    single<Repository> { RepositoryImpl() }
    factory<GetFeedUseCase> { GetFeedUseCaseImpl(repository = get()) }
    viewModel<MainViewModel> { MainViewModel(getFeedUseCase = get()) }
}
