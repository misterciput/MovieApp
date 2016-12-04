package com.example.mzulfs.movieapp.app;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mzulfs.movieapp.app.MovieContainers.MovieObject;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mzulfs on 12/4/16.
 */

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MovieViewHolder>{
    List<MovieObject> movieList;

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;

        public MovieViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.movie_imageview);
        }
    }

    public MovieRecyclerAdapter(List<MovieObject> movieList){
        this.movieList = movieList;
    }


    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_movie, parent, false);

        return new MovieViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        MovieObject movie = movieList.get(position);
        String posterPath = movie.getPoster();
        final String baseURL = "http://image.tmdb.org/t/p/w185";

        Uri uri = Uri.parse(baseURL)
                .buildUpon()
                .appendEncodedPath(posterPath)
                .build();

        holder.imageView.setAdjustViewBounds(true);
        Picasso.with(holder.imageView.getContext()).load(uri.toString()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
