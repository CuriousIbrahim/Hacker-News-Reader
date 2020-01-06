package com.ibrahim.hackernewsreader.model;

import com.ibrahim.hackernewsreader.model.base.Item;

import java.util.List;

public class Comment extends Item {
    String parent;
    private int descendants;
    private List<Item> kids;

}
