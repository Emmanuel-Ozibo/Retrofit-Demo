package com.example.dell.myapplication2.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultList{
    @SerializedName("vote_count")
    public int vote_count;
    @SerializedName("id")
    public int id;
    @SerializedName("vote_average")
    public double vote_average;
    @SerializedName("title")
    public String title;
    @SerializedName("popularity")
    public double popularity;
    @SerializedName("poster_path")
    public String poster_path;
    @SerializedName("original_language")
    public String original_language;
    @SerializedName("original_title")
    public String original_title;
    @SerializedName("genre_ids")
    public List<Integer> genre_ids;
    @SerializedName("backdrop_path")
    public String backdrop_path;
    @SerializedName("adult")
    public boolean adult;
    @SerializedName("overview")
    public String overview;
    @SerializedName("release_date")
    public String release_date;

    public int getVote_count() {
        return vote_count;
    }

    public int getId() {
        return id;
    }

    public double getVote_average() {
        return vote_average;
    }

    public String getTitle() {
        return title;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public List<Integer> getGenre_ids() {
        return genre_ids;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getRelease_date() {
        return release_date;
    }
}
