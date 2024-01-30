package kz.assylkhanov.mvvm.data.mapper

import kz.assylkhanov.mvvm.data.db.PostEntity
import kz.assylkhanov.mvvm.domain.Post

/**
 * @author a.asylkhanov
 */
class PostsMapper {
    fun fromEntityToDomain(postEntity: PostEntity): Post {
        return Post(
            id = postEntity.id,
            title = postEntity.title
        )
    }

    fun fromDomainToEntity(post: Post): PostEntity {
        return PostEntity(
            id = post.id,
            title = post.title
        )
    }
}
