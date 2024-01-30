package kz.assylkhanov.mvvm.data

import kz.assylkhanov.mvvm.domain.AddPostUseCase
import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
class AddPostUseCaseImpl(private val repo: Repository) : AddPostUseCase {
    override suspend fun invoke(post: Post) {
        repo.addPost(post)
    }
}
