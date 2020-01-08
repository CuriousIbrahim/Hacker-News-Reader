package com.ibrahim.hackernewsreader.api;

import com.ibrahim.hackernewsreader.Util;
import com.ibrahim.hackernewsreader.api.core.APITest;
import com.ibrahim.hackernewsreader.api.test_case.IStoryTestCase;
import com.ibrahim.hackernewsreader.model.Story;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class StoryAPITest extends APITest implements IStoryTestCase {

    static Story story;

    @Before
    @Override
    public void getItem() {
        story = (Story) access.getPost(8863);
    }

    @Test
    @Override
    public void check_url() {
        String expected = "http://www.getdropbox.com/u/2/screencast.html";
        assertEquals(expected, story.getUrl());
    }

    @Test
    @Override
    public void check_by() {
        String expected = "dhouston";
        assertEquals(expected, story.getBy());
    }

    @Test
    @Override
    public void check_descendants() {
        int expected = 71;
        assertEquals(expected, story.getDescendants());
    }

    @Test
    @Override
    public void check_kids() {
        long[] expected = {9224, 8917, 8952, 8884, 8887, 8869, 8958, 8940, 8908, 9005, 8873, 9671, 9067, 9055, 8865, 8881, 8872, 8955, 10403, 8903, 8928, 9125, 8998, 8901, 8902, 8907, 8894, 8870, 8878, 8980, 8934, 8943, 8876};
        assertArrayEquals(expected, Util.listToArrayLong(story.getKids()));
    }

    @Test
    @Override
    public void check_score() {
        int expected = 104;
        assertEquals(expected, story.getScore());
    }

    @Test
    @Override
    public void check_time() {
        long expected = 1175714200;
        assertEquals(expected, story.getTime());
    }

    @Test
    @Override
    public void check_title() {
        String expected = "My YC app: Dropbox - Throw away your USB drive";
        assertEquals(expected, story.getTitle());
    }

    @Test
    @Override
    public void check_id() {
        long expected = 8863;
        assertEquals(expected, story.getId());
    }

    @Test
    @Override
    public void check_text() {
        String expected = "";
        assertEquals(expected, story.getText());
    }
}
