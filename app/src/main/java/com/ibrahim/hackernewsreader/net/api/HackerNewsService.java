package com.ibrahim.hackernewsreader.net.api;

import com.ibrahim.hackernewsreader.net.api.model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface HackerNewsService {

    @GET("v0/item/{item}.json")
    Call<Item> item(@Path("item") long item);

    @GET("v0/user/{user}.json")
    Call<Item> user(@Path("user") long user);

    @GET("v0/topstories.json")
    Call<List<Long>> topStories();

    @GET("v0/newstories")
    Call<List<Long>> newStories();

    @GET("v0/beststories")
    Call<List<Long>> bestStories();

    @GET("v0/askstories")
    Call<List<Long>> askStories();

    @GET("v0/showstories")
    Call<List<Long>> showStories();

    @GET("v0/jobstories")
    Call<List<Long>> jobStories();

}
