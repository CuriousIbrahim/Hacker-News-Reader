package com.ibrahim.hackernewsreader.model;

import com.ibrahim.hackernewsreader.model.base.Item;

import java.util.List;

public class Comment extends Item {
    long parent;
    private int descendants;
    private List<Long> kids;

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    public int getDescendants() {
        return descendants;
    }

    public void setDescendants(int descendants) {
        this.descendants = descendants;
    }

    public List<Long> getKids() {
        return kids;
    }

    public void setKids(List<Long> kids) {
        this.kids = kids;
    }
}
