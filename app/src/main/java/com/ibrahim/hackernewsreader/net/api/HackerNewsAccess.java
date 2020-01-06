package com.ibrahim.hackernewsreader.net.api;

import com.ibrahim.hackernewsreader.model.base.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;

public class HackerNewsAccess {

    private HackerNewsService service;

    public HackerNewsAccess() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(" https://hacker-news.firebaseio.com")
                .build();

        service = retrofit.create(HackerNewsService.class);
    }

//    public List<Item> topStories() {
//        Call<List<Long>> storyIds = service.topStories();
//
//
//
//
//    }
}
