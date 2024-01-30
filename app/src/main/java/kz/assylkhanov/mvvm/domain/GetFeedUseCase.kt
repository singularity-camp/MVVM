package kz.assylkhanov.mvvm.domain

/**
 * @author a.asylkhanov
 */
interface GetFeedUseCase {
    fun invoke(): List<Post>
}
