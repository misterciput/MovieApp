package com.mzulfs.MovieApp.app.event.events;


import com.mzulfs.MovieApp.app.entity.Movie;

public class UpdateMovieEvent {

    public final Movie movie;

    public UpdateMovieEvent(Movie movie) {
        this.movie = movie;
    }

}
