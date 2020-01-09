package com.ibrahim.hackernewsreader.api;

import com.ibrahim.hackernewsreader.api.core.APITest;
import com.ibrahim.hackernewsreader.api.test_case.IJobPostTestCase;
import com.ibrahim.hackernewsreader.model.JobPost;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JobAPITest extends APITest implements IJobPostTestCase {

    JobPost job;

    @Override
    @Before
    public void getItem() {
        job = (JobPost) access.getItem(192327);
    }

    @Override
    @Test
    public void check_url() {
        String expected = "";
        assertEquals(expected, job.getUrl());
    }

    @Override
    @Test
    public void check_title() {
        String expected = "Justin.tv is looking for a Lead Flash Engineer!";
        assertEquals(expected, job.getTitle());
    }

    @Override
    @Test
    public void check_score() {
        int expected = 6;
        assertEquals(expected, job.getScore());
    }

    @Override
    @Test
    public void check_id() {
        long expected = 192327;
        assertEquals(expected, job.getId());
    }

    @Override
    @Test
    public void check_by() {
        String expected = "justin";
        assertEquals(expected, job.getBy());
    }

    @Override
    @Test
    public void check_text() {
        String text = "Justin.tv is the biggest live video site online. We serve hundreds of thousands of video streams a day, and have supported up to 50k live concurrent viewers. Our site is growing every week, and we just added a 10 gbps line to our colo. Our unique visitors are up 900% since January.<p>There are a lot of pieces that fit together to make Justin.tv work: our video cluster, IRC server, our web app, and our monitoring and search services, to name a few. A lot of our website is dependent on Flash, and we're looking for talented Flash Engineers who know AS2 and AS3 very well who want to be leaders in the development of our Flash.<p>Responsibilities<p><pre><code>    * Contribute to product design and implementation discussions\n    * Implement projects from the idea phase to production\n    * Test and iterate code before and after production release \n</code></pre>\nQualifications<p><pre><code>    * You should know AS2, AS3, and maybe a little be of Flex.\n    * Experience building web applications.\n    * A strong desire to work on website with passionate users and ideas for how to improve it.\n    * Experience hacking video streams, python, Twisted or rails all a plus.\n</code></pre>\nWhile we're growing rapidly, Justin.tv is still a small, technology focused company, built by hackers for hackers. Seven of our ten person team are engineers or designers. We believe in rapid development, and push out new code releases every week. We're based in a beautiful office in the SOMA district of SF, one block from the caltrain station. If you want a fun job hacking on code that will touch a lot of people, JTV is for you.<p>Note: You must be physically present in SF to work for JTV. Completing the technical problem at <a href=\"http://www.justin.tv/problems/bml\" rel=\"nofollow\">http://www.justin.tv/problems/bml</a> will go a long way with us. Cheers!";
        assertEquals(text, job.getText());
    }

    @Override
    @Test
    public void check_time() {
        long time = 1210981217;
        assertEquals(time, job.getTime());
    }
}
