package com.example.dell.myapplication2.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.dell.myapplication2.Models.MovieResponse;
import com.example.dell.myapplication2.R;


/**
 * Created by emmanuel on 19/09/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{
    private MovieResponse movieResponse;

    public MovieAdapter(MovieResponse movieResponse) {
        this.movieResponse = movieResponse;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.onBindViews(position);
    }

    @Override
    public int getItemCount() {
        if (movieResponse.resultListList == null){
            return 0;
        }
        return movieResponse.resultListList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        private TextView title;

        public MovieViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
        }

        void onBindViews(int position){
            title.setText(movieResponse.resultListList.get(position).title);
        }
    }
}
