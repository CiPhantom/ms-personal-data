package org.comedy.infra.mapper;

import org.comedy.domain.data.Subscriber;
import org.comedy.infra.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserEntityMapper {
    Subscriber map(UserEntity userEntity);

    UserEntity map(Subscriber subscriberEntity);
}
