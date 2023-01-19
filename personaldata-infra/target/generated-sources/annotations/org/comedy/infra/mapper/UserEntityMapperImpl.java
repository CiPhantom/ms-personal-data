package org.comedy.infra.mapper;

import javax.annotation.processing.Generated;
import org.comedy.domain.data.Subscriber;
import org.comedy.infra.entity.UserEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-18T21:28:32+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class UserEntityMapperImpl implements UserEntityMapper {

    @Override
    public Subscriber map(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        Subscriber subscriber = new Subscriber();

        subscriber.setLogin( userEntity.getLogin() );
        subscriber.setPassword( userEntity.getPassword() );
        subscriber.setFirstname( userEntity.getFirstname() );
        subscriber.setLastname( userEntity.getLastname() );
        subscriber.setBirthday( userEntity.getBirthday() );
        subscriber.setEmail( userEntity.getEmail() );
        subscriber.setBiography( userEntity.getBiography() );
        subscriber.setExpertise( userEntity.getExpertise() );

        return subscriber;
    }

    @Override
    public UserEntity map(Subscriber subscriberEntity) {
        if ( subscriberEntity == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setLogin( subscriberEntity.getLogin() );
        userEntity.setPassword( subscriberEntity.getPassword() );
        userEntity.setFirstname( subscriberEntity.getFirstname() );
        userEntity.setLastname( subscriberEntity.getLastname() );
        userEntity.setBirthday( subscriberEntity.getBirthday() );
        userEntity.setEmail( subscriberEntity.getEmail() );
        userEntity.setBiography( subscriberEntity.getBiography() );
        userEntity.setExpertise( subscriberEntity.getExpertise() );

        return userEntity;
    }
}
