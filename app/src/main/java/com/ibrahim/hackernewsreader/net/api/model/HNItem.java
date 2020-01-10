package com.ibrahim.hackernewsreader.net.api.model;

import java.util.List;

public class HNItem {

    public static final int JOB = 1;
    public static final int STORY = 2;
    public static final int COMMENT = 3;
    public static final int POLL = 4;
    public static final int POLLPOT = 5;

    private long id;
    private boolean deleted;
    private String type;
    private String by;
    private long time;
    private String text = "";
    private boolean dead;
    private long parent;
    private int poll;
    private List<Long> kids;
    private String url = "";
    private int score;
    private String title;
    private List<Long> parts;
    private int descendants;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    public int getPoll() {
        return poll;
    }

    public void setPoll(int poll) {
        this.poll = poll;
    }

    public List<Long> getKids() {
        return kids;
    }

    public void setKids(List<Long> kids) {
        this.kids = kids;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Long> getParts() {
        return parts;
    }

    public void setParts(List<Long> parts) {
        this.parts = parts;
    }

    public int getDescendants() {
        return descendants;
    }

    public void setDescendants(int descendants) {
        this.descendants = descendants;
    }

    public boolean isJob() {
        return type.equals("job");
    }

    public boolean isStory() {
        return type.equals("story");
    }

    public boolean isComment() {
        return type.equals("comment");
    }

    public boolean isPoll() {
        return type.equals("poll");
    }

    public boolean isPollOpt() {
        return type.equals("pollopt");
    }


}
