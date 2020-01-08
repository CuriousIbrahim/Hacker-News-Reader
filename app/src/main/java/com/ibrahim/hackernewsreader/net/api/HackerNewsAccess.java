package com.ibrahim.hackernewsreader.net.api;

import com.ibrahim.hackernewsreader.model.base.Item;
import com.ibrahim.hackernewsreader.model.base.Post;
import com.ibrahim.hackernewsreader.net.api.factory.ItemFactory;
import com.ibrahim.hackernewsreader.net.api.model.HNItem;
import com.ibrahim.hackernewsreader.net.api.model.Type;

import java.util.ArrayList;
import java.util.List;


import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
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
//    public List<Item> topStories() {
//
//        List<Item> items = new ArrayList<>();
//
//        Flowable<List<Long>> storyIds = service.topStories();
//
//        Flowable.fromArray(storyIds).subscribe(new Consumer<Flowable<List<Long>>>() {
//            @Override
//            public void accept(Flowable<List<Long>> listFlowable) throws Exception {
//                for (long id : listFlowable) {
//
//                }
//            }
//        })
//    }

//    public Post getPost(long id) {
//        Single<HNItem> item = service.item(id);
//
//        Item post;
//
//        item.subscribe(new Consumer<HNItem>() {
//            @Override
//            public void accept(HNItem hnItem) throws Exception {
//                Type type = hnItem.getType();
//
//                post = ItemFactory.makeItem(type);
//
//
//            }
//        })
//    }
}
