package com.example.dell.myapplication2.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse{
    @SerializedName("page")
    public int page;
    @SerializedName("total_results")
    public int results;
    @SerializedName("total_pages")
    public int pages;
    @SerializedName("results")
    public List<ResultList> resultListList;

    public int getPage() {
        return page;
    }

    public int getResults() {
        return results;
    }

    public int getPages() {
        return pages;
    }

    public List<ResultList> getResultListList() {
        return resultListList;
    }
}
