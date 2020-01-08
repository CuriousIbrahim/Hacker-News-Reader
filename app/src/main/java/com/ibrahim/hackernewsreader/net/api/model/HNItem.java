package com.ibrahim.hackernewsreader.net.api.model;

public class HNItem {

    long id;
    boolean deleted;
    Type type;
    String by;
    long time;
    String text;
    boolean dead;
    long parent;
    long poll;
    long kids[];
    String url;
    int score;
    String title;
    long parts[];
    int descendants;

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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
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

    public long getPoll() {
        return poll;
    }

    public void setPoll(long poll) {
        this.poll = poll;
    }

    public long[] getKids() {
        return kids;
    }

    public void setKids(long[] kids) {
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

    public long[] getParts() {
        return parts;
    }

    public void setParts(long[] parts) {
        this.parts = parts;
    }

    public int getDescendants() {
        return descendants;
    }

    public void setDescendants(int descendants) {
        this.descendants = descendants;
    }
}
