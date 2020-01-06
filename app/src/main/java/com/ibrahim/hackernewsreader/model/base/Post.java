package com.ibrahim.hackernewsreader.model.base;

import java.util.List;

public abstract class Post extends Item {
    String title;
    private int descendants;
    int score;
    private List<Item> kids;

}
