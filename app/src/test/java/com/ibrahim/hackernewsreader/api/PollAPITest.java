package com.ibrahim.hackernewsreader.api;

import com.ibrahim.hackernewsreader.Util;
import com.ibrahim.hackernewsreader.api.core.APITest;
import com.ibrahim.hackernewsreader.api.test_case.IPollPostTestCase;
import com.ibrahim.hackernewsreader.model.PollPost;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;


public class PollAPITest extends APITest implements IPollPostTestCase {

    PollPost poll;

    @Override
    @Before
    public void getItem() {
        poll = (PollPost) access.getItem(126809);
    }

    @Override
    @Test
    public void check_parts() {
        long[] e = {126810, 126811, 126812};
        assertArrayEquals(e, Util.listToArrayLong(poll.getParts()));
    }

    @Override
    @Test
    public void check_title() {
        String e = "Poll: What would happen if News.YC had explicit support for polls?";
        assertEquals(e, poll.getTitle());
    }

    @Override
    @Test
    public void check_score() {
        int e = 47;
        assertEquals(e, poll.getScore());
    }

    @Override
    @Test
    public void check_id() {
        long e = 126809;
        assertEquals(e, poll.getId());
    }

    @Override
    @Test
    public void check_by() {
        String e = "pg";
        assertEquals(e, poll.getBy());
    }

    @Override
    @Test
    public void check_text() {
        String text = "";
        assertEquals(text, poll.getText());
    }

    @Override
    @Test
    public void check_time() {
        long time = 1204403652;
        assertEquals(time, poll.getTime());
    }
}
