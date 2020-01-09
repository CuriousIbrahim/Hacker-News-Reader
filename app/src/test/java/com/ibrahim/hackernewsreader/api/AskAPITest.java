package com.ibrahim.hackernewsreader.api;

import com.ibrahim.hackernewsreader.Util;
import com.ibrahim.hackernewsreader.api.core.APITest;
import com.ibrahim.hackernewsreader.api.test_case.IStoryTestCase;
import com.ibrahim.hackernewsreader.model.Story;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class AskAPITest extends APITest implements IStoryTestCase {

    Story ask;

    @Override
    @Before
    public void getItem() {
        ask = (Story) access.getItem(160705);
    }

    @Override
    @Test
    public void check_url() {
        String expected = "";
        assertEquals(expected, ask.getUrl());
    }

    @Override
    @Test
    public void check_kids() {
        long[] expected = {121016, 121109, 121168};
        assertArrayEquals(expected, Util.listToArrayLong(ask.getKids()));
    }

    @Override
    @Test
    public void check_descendants() {
        int expected = 16;
        assertEquals(expected, ask.getDescendants());
    }

    @Override
    @Test
    public void check_title() {
        String expected = "Ask HN: The Arc Effect";
        assertEquals(expected, ask.getTitle());
    }

    @Override
    @Test
    public void check_score() {
        int expected = 25;
        assertEquals(expected, ask.getScore());
    }

    @Override
    @Test
    public void check_id() {
        long expected = 121003;
        assertEquals(expected, ask.getId());
    }

    @Override
    @Test
    public void check_by() {
        String expected = "tel";
        assertEquals(expected, ask.getBy());
    }

    @Override
    @Test
    public void check_text() {
        String expected = "<i>or</i> HN: the Next Iteration<p>I get the impression that with Arc being released a lot of people who never had time for HN before are suddenly dropping in more often. (PG: what are the numbers on this? I'm envisioning a spike.)<p>Not to say that isn't great, but I'm wary of Diggification. Between links comparing programming to sex and a flurry of gratuitous, ostentatious  adjectives in the headlines it's a bit concerning.<p>80% of the stuff that makes the front page is still pretty awesome, but what's in place to keep the signal/noise ratio high? Does the HN model still work as the community scales? What's in store for (++ HN)?";
        assertEquals(expected, ask.getText());
    }

    @Override
    @Test
    public void check_time() {
        long expected = 1203647620;
        assertEquals(expected, ask.getTime());
    }
}
