package com.ibrahim.hackernewsreader.model;

import com.ibrahim.hackernewsreader.model.base.CommentablePost;
import com.ibrahim.hackernewsreader.model.base.Post;

public class Story extends CommentablePost {
    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
