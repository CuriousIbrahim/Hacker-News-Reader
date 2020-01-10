package com.ibrahim.hackernewsreader.model.base;

import java.util.List;

public class CommentablePost extends Post {
    private List<Long> kids;
    private int descendants;

    public List<Long> getKids() {
        return kids;
    }

    public void setKids(List<Long> kids) {
        this.kids = kids;
    }

    public int getDescendants() {
        return descendants;
    }

    public void setDescendants(int descendants) {
        this.descendants = descendants;
    }
}
