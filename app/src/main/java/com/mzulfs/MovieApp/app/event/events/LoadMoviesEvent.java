package com.mzulfs.MovieApp.app.event.events;


import com.mzulfs.MovieApp.app.entity.MovieResults;

public final class LoadMoviesEvent implements ApiEvent {

    public final MovieResults.SortCriteria sortCriteria;

    public LoadMoviesEvent(MovieResults.SortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

}
