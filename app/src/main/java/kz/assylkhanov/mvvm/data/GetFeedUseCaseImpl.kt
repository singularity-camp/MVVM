package kz.assylkhanov.mvvm.data

import kz.assylkhanov.mvvm.domain.GetFeedUseCase
import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
class GetFeedUseCaseImpl(private val repository: Repository) : GetFeedUseCase {
    override fun invoke(): List<Post> {
        return repository.getFeed()
    }
}
