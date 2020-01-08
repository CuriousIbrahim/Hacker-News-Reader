package com.ibrahim.hackernewsreader.model;

public class User {
    long id;
    int delay;
    long created;
    int karma;
    String about;
    long submitted[];

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public long[] getSubmitted() {
        return submitted;
    }

    public void setSubmitted(long[] submitted) {
        this.submitted = submitted;
    }
}
