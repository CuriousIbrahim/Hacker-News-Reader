package com.ibrahim.hackernewsreader.net.api;

import com.ibrahim.hackernewsreader.model.base.Item;
import com.ibrahim.hackernewsreader.model.base.Post;
import com.ibrahim.hackernewsreader.net.api.factory.ItemFactory;
import com.ibrahim.hackernewsreader.net.api.model.HNItem;
import com.ibrahim.hackernewsreader.net.api.model.Type;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Single;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HackerNewsAccess {

    private HackerNewsService service;

    public HackerNewsAccess() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(" https://hacker-news.firebaseio.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        service = retrofit.create(HackerNewsService.class);
    }
    public List<Item> topStories() {

        List<Item> items = new ArrayList<>();

        Single<List<Long>> storyIds = service.topStories();

        storyIds.subscribe(s -> {
           for (long id : s) {
               items.add(getPost(id));
           }
        });
        return topStories();
    }

    public Post getPost(long id) {
        Single<HNItem> item = service.item(id);

        final Post[] post = new Post[1];

        item.subscribe(s -> {
            post[0] = ItemFactory.makePost(s);

        });


        return post[0];
    }
}
