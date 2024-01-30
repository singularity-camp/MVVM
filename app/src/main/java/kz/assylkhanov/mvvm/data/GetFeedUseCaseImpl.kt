package kz.assylkhanov.mvvm.data

import kotlinx.coroutines.flow.Flow
import kz.assylkhanov.mvvm.domain.GetFeedUseCase
import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
class GetFeedUseCaseImpl(private val repository: Repository) : GetFeedUseCase {
    override suspend fun invoke(): Flow<List<Post>> {
        return repository.getFeed()
    }
}
