package com.mzulfs.MovieApp.app.event.events;

import android.support.annotation.NonNull;

import com.mzulfs.MovieApp.app.entity.Movie;


public final class MovieUpdatedEvent {

    public final Movie movie;

    public MovieUpdatedEvent(@NonNull Movie movie) {
        this.movie = movie;
    }

}
