package com.ibrahim.hackernewsreader.model;

import com.ibrahim.hackernewsreader.model.base.Item;

import java.util.List;

public class Comment extends Item {
    private long parent;
    private List<Long> kids;

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    public List<Long> getKids() {
        return kids;
    }

    public void setKids(List<Long> kids) {
        this.kids = kids;
    }
}
