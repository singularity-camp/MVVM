package kz.assylkhanov.mvvm.di

import kz.assylkhanov.mvvm.data.AddPostUseCaseImpl
import kz.assylkhanov.mvvm.data.GetFeedUseCaseImpl
import kz.assylkhanov.mvvm.data.Repository
import kz.assylkhanov.mvvm.data.RepositoryImpl
import kz.assylkhanov.mvvm.data.mapper.PostsMapper
import kz.assylkhanov.mvvm.domain.AddPostUseCase
import kz.assylkhanov.mvvm.domain.GetFeedUseCase
import kz.assylkhanov.mvvm.presenter.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * @author a.asylkhanov
 */

val mainModule = module {
    single<Repository> { RepositoryImpl(postDao = get(), postsMapper = get()) }
    factory<GetFeedUseCase> { GetFeedUseCaseImpl(repository = get()) }
    factory<AddPostUseCase> { AddPostUseCaseImpl(repo = get()) }
    viewModel<MainViewModel> { MainViewModel(getFeedUseCase = get(), addPostUseCase = get()) }
    factory<PostsMapper> { PostsMapper() }
}
