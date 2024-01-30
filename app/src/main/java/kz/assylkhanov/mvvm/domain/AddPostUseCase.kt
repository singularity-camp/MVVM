package kz.assylkhanov.mvvm.domain

/**
 * @author a.asylkhanov
 */
interface AddPostUseCase {
    suspend fun invoke(post: Post)
}
