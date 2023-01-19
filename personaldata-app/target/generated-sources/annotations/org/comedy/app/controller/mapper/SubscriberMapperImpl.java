package org.comedy.app.controller.mapper;

import javax.annotation.processing.Generated;
import org.comedy.app.controller.data.SubscribeRequest;
import org.comedy.domain.data.Subscriber;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-18T21:28:34+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class SubscriberMapperImpl implements SubscriberMapper {

    @Override
    public Subscriber map(SubscribeRequest subscribeRequest) {
        if ( subscribeRequest == null ) {
            return null;
        }

        Subscriber subscriber = new Subscriber();

        subscriber.setLogin( subscribeRequest.getLogin() );
        subscriber.setPassword( subscribeRequest.getPassword() );
        subscriber.setFirstname( subscribeRequest.getFirstname() );
        subscriber.setLastname( subscribeRequest.getLastname() );
        subscriber.setBirthday( subscribeRequest.getBirthday() );
        subscriber.setBirthCountry( subscribeRequest.getBirthCountry() );
        subscriber.setEmail( subscribeRequest.getEmail() );
        subscriber.setBiography( subscribeRequest.getBiography() );
        subscriber.setExpertise( subscribeRequest.getExpertise() );

        return subscriber;
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
