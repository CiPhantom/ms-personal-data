package org.comedy.app.controller.mapper;

import javax.annotation.processing.Generated;
import org.comedy.app.controller.data.SubscribeRequest;
import org.comedy.domain.data.Subscriber;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-13T20:25:16+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class SubscriberMapperImpl implements SubscriberMapper {

    @Override
    public Subscriber map(SubscribeRequest subscribeRequest) {
        if ( subscribeRequest == null ) {
            return null;
        }

        Subscriber.SubscriberBuilder subscriber = Subscriber.builder();

        subscriber.login( subscribeRequest.getLogin() );
        subscriber.password( subscribeRequest.getPassword() );
        subscriber.firstname( subscribeRequest.getFirstname() );
        subscriber.lastname( subscribeRequest.getLastname() );
        subscriber.birthday( subscribeRequest.getBirthday() );
        subscriber.birthCountry( subscribeRequest.getBirthCountry() );
        subscriber.email( subscribeRequest.getEmail() );
        subscriber.biography( subscribeRequest.getBiography() );
        subscriber.expertise( subscribeRequest.getExpertise() );

        return subscriber.build();
    }

    @Override
    public SubscribeRequest map(Subscriber subscribeRequest) {
        if ( subscribeRequest == null ) {
            return null;
        }

        SubscribeRequest subscribeRequest1 = new SubscribeRequest();

        subscribeRequest1.setLogin( subscribeRequest.getLogin() );
        subscribeRequest1.setPassword( subscribeRequest.getPassword() );
        subscribeRequest1.setFirstname( subscribeRequest.getFirstname() );
        subscribeRequest1.setLastname( subscribeRequest.getLastname() );
        subscribeRequest1.setBirthday( subscribeRequest.getBirthday() );
        subscribeRequest1.setBirthCountry( subscribeRequest.getBirthCountry() );
        subscribeRequest1.setEmail( subscribeRequest.getEmail() );
        subscribeRequest1.setBiography( subscribeRequest.getBiography() );
        subscribeRequest1.setExpertise( subscribeRequest.getExpertise() );

        return subscribeRequest1;
    }
}
