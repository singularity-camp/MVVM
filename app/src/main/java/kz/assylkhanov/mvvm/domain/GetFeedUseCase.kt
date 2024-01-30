package kz.assylkhanov.mvvm.domain

import kotlinx.coroutines.flow.Flow

/**
 * @author a.asylkhanov
 */
interface GetFeedUseCase {
    suspend fun invoke(): Flow<List<Post>>
}
