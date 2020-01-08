package com.ibrahim.hackernewsreader.model;

import com.ibrahim.hackernewsreader.model.base.CommentablePost;
import com.ibrahim.hackernewsreader.model.base.Post;

import java.util.List;

public class PollPost extends CommentablePost {
    List<Long> parts;

    public List<Long> getParts() {
        return parts;
    }

    public void setParts(List<Long> parts) {
        this.parts = parts;
    }
}
