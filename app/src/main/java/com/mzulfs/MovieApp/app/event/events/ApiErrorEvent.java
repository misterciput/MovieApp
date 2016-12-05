package com.mzulfs.MovieApp.app.event.events;

// represents a network / API related error
public final class ApiErrorEvent implements com.mzulfs.MovieApp.app.event.events.ApiEvent {

    public final com.mzulfs.MovieApp.app.event.events.ApiEvent sourceEvent;
    public final Throwable throwable;

    public ApiErrorEvent(com.mzulfs.MovieApp.app.event.events.ApiEvent sourceEvent, Throwable throwable) {
        this.sourceEvent = sourceEvent;
        this.throwable = throwable;
    }

}
