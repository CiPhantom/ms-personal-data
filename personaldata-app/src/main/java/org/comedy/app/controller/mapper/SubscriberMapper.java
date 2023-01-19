package org.comedy.app.controller.mapper;

import org.comedy.app.controller.data.SubscribeRequest;
import org.comedy.domain.data.Subscriber;
import org.mapstruct.Mapper;

@Mapper
public interface SubscriberMapper {
    Subscriber map(SubscribeRequest subscribeRequest);

    SubscribeRequest map(Subscriber subscribeRequest);
}
