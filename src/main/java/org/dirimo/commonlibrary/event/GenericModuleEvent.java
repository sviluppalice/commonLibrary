package org.dirimo.commonlibrary.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class GenericModuleEvent<T> extends ApplicationEvent {

    private final T payload;
    private final EventType eventType;

    public GenericModuleEvent(Object source, EventType eventType, T payload) {
        super(source);
        this.eventType = eventType;
        this.payload = payload;
    }
}
