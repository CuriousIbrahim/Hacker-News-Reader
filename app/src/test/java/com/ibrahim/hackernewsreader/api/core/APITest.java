package com.ibrahim.hackernewsreader.api.core;

import com.ibrahim.hackernewsreader.net.api.HackerNewsAccess;

import org.junit.Before;
import org.junit.BeforeClass;

public abstract class APITest {
    public static HackerNewsAccess access;

    @BeforeClass
    public static void setUpOnce() {
        access = new HackerNewsAccess();
    }

    @Before
    public abstract void getItem();

}
