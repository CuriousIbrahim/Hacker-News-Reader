package com.ibrahim.hackernewsreader.net.api;

import com.ibrahim.hackernewsreader.net.api.model.HNItem;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface HackerNewsService {

    @GET("v0/item/{item}.json")
    Single<HNItem> item(@Path("item") long item);

    @GET("v0/user/{user}.json")
    Single<HNItem> user(@Path("user") long user);

    @GET("v0/topstories.json")
    Single<List<Long>> topStories();

    @GET("v0/newstories")
    Flowable<List<Long>> newStories();

    @GET("v0/beststories")
    Flowable<List<Long>> bestStories();

    @GET("v0/askstories")
    Flowable<List<Long>> askStories();

    @GET("v0/showstories")
    Flowable<List<Long>> showStories();

    @GET("v0/jobstories")
    Flowable<List<Long>> jobStories();

}
