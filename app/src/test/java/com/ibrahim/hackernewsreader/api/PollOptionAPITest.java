package com.ibrahim.hackernewsreader.api;

import com.ibrahim.hackernewsreader.api.core.APITest;
import com.ibrahim.hackernewsreader.api.test_case.IPollOptionTestCase;
import com.ibrahim.hackernewsreader.model.PollOption;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PollOptionAPITest extends APITest implements IPollOptionTestCase {

    private PollOption pollOption;

    @Override
    @Before
    public void getItem() {
        pollOption = (PollOption) access.getItem(160705);
    }

    @Override
    @Test
    public void check_poll() {
        long expected = 160704;
        assertEquals(expected, pollOption.getPoll());
    }

    @Override
    @Test
    public void check_score() {
        int expected = 335;
        assertEquals(expected, pollOption.getScore());
    }

    @Override
    @Test
    public void check_id() {
        long expected = 160705;
        assertEquals(expected, pollOption.getId());
    }

    @Override
    @Test
    public void check_by() {
        String expected = "pg";
        assertEquals(expected, pollOption.getBy());
    }

    @Override
    @Test
    public void check_text() {
        String expected = "Yes, ban them; I'm tired of seeing Valleywag stories on News.YC.";
        assertEquals(expected, pollOption.getText());
    }

    @Override
    @Test
    public void check_time() {
        long expected = 1207886576;
        assertEquals(expected, pollOption.getTime());
    }
}
