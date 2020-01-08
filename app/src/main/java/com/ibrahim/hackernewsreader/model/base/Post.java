package com.ibrahim.hackernewsreader.model.base;

import java.util.List;

public abstract class Post extends Item {
    private String title;
    private int score;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
