package com.ibrahim.hackernewsreader.model;

import com.ibrahim.hackernewsreader.model.base.Item;

public class PollOption extends Item {
    private long poll;
    private int score;

    public long getPoll() {
        return poll;
    }

    public void setPoll(long poll) {
        this.poll = poll;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
