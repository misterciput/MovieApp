package com.mzulfs.MovieApp.app.event.events;

public class LoadMovieEvent implements ApiEvent {

    public final int id;

    public LoadMovieEvent(int id) {
        this.id = id;
    }

}
