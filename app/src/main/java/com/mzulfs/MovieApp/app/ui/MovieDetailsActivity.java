package com.mzulfs.MovieApp.app.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.mzulfs.MovieApp.app.R;
import com.mzulfs.MovieApp.app.entity.Movie;
import com.mzulfs.MovieApp.app.event.events.MovieLoadedEvent;
import com.squareup.otto.Subscribe;

import butterknife.ButterKnife;

public class MovieDetailsActivity extends BaseActivity {

    private static final String TAG = "MovieDetailsActivity";
    private Movie mMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        ButterKnife.bind(this);

        mMovie = Movie.fromParcelable(getIntent().getExtras().getParcelable(BundleKeys.MOVIE));

        if (savedInstanceState == null) {
            Fragment detailsFragment = MovieDetailsFragment.newInstance(mMovie, false);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, detailsFragment,
                            MovieDetailsFragment.class.getSimpleName())
                    .commit();
        }
    }

    @Subscribe
    public void onMovieLoadedEvent(MovieLoadedEvent event) {
        mMovie = event.movie;
    }

}
