package com.ibrahim.hackernewsreader.api;

import com.ibrahim.hackernewsreader.Util;
import com.ibrahim.hackernewsreader.api.core.APITest;
import com.ibrahim.hackernewsreader.api.test_case.ICommentTestCase;
import com.ibrahim.hackernewsreader.model.Comment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class CommentAPITest extends APITest implements ICommentTestCase {

    private Comment comment;

    @Override
    @Before
    public void getItem() {
        comment = (Comment) access.getItem(2921983);
    }

    @Override
    @Test
    public void check_parent() {
        long expected = 2921506;
        assertEquals(expected, comment.getParent());
    }

    @Override
    @Test
    public void check_kids() {
        long[] expected = {2922097, 2922429, 2924562, 2922709, 2922573, 2922140, 2922141};
        assertArrayEquals(expected, Util.listToArrayLong(comment.getKids()));
    }

    @Override
    @Test
    public void check_id() {
        long expected = 2921983;
        assertEquals(expected, comment.getId());
    }

    @Override
    @Test
    public void check_by() {
        String expected = "norvig";
        assertEquals(expected, comment.getBy());
    }

    @Override
    @Test
    public void check_text() {
        String expected = "Aw shucks, guys ... you make me blush with your compliments.<p>Tell you what, Ill make a deal: I'll keep writing if you keep reading. K?";
        assertEquals(expected, comment.getText());
    }

    @Override
    @Test
    public void check_time() {
        long expected = 1314211127;
        assertEquals(expected, comment.getTime());
    }
}
