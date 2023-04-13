package org.comedy.infra.mapper;

import javax.annotation.processing.Generated;
import org.comedy.domain.data.Subscriber;
import org.comedy.infra.entity.UserEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-13T20:25:14+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class UserEntityMapperImpl implements UserEntityMapper {

    @Override
    public Subscriber map(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        Subscriber.SubscriberBuilder subscriber = Subscriber.builder();

        subscriber.login( userEntity.getLogin() );
        subscriber.password( userEntity.getPassword() );
        subscriber.firstname( userEntity.getFirstname() );
        subscriber.lastname( userEntity.getLastname() );
        subscriber.birthday( userEntity.getBirthday() );
        subscriber.email( userEntity.getEmail() );
        subscriber.biography( userEntity.getBiography() );
        subscriber.expertise( userEntity.getExpertise() );

        return subscriber.build();
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
