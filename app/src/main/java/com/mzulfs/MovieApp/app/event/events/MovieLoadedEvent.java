package com.mzulfs.MovieApp.app.event.events;

import android.support.annotation.NonNull;

import com.mzulfs.MovieApp.app.entity.Movie;


public class MovieLoadedEvent {

    public final Movie movie;

    public MovieLoadedEvent(@NonNull Movie movie) {
        this.movie = movie;
    }

}
