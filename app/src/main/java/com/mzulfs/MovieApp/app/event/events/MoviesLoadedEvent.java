package com.mzulfs.MovieApp.app.event.events;

import com.mzulfs.MovieApp.app.entity.Movie;
import com.mzulfs.MovieApp.app.entity.MovieResults;

import java.util.List;


public final class MoviesLoadedEvent {

    public final List<Movie> movies;
    public final MovieResults.SortCriteria sortCriteria;

    public MoviesLoadedEvent(List<Movie> movies, MovieResults.SortCriteria sortCriteria) {
        this.movies = movies;
        this.sortCriteria = sortCriteria;
    }

}
