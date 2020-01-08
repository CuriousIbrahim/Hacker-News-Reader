package com.ibrahim.hackernewsreader.net.api.factory;

import com.ibrahim.hackernewsreader.model.Comment;
import com.ibrahim.hackernewsreader.model.JobPost;
import com.ibrahim.hackernewsreader.model.PollOption;
import com.ibrahim.hackernewsreader.model.PollPost;
import com.ibrahim.hackernewsreader.model.Story;
import com.ibrahim.hackernewsreader.model.base.Item;
import com.ibrahim.hackernewsreader.net.api.model.Type;

public class ItemFactory {

    public static Item makeItem(Type type) {
        Item item = null;

        switch (type) {
            case STORY:
                item = new Story();
            case JOB:
                item = new JobPost();
            case POLL:
                item = new PollPost();
            case COMMENT:
                item = new Comment();
            case POLLOPT:
                item = new PollOption();
        }

        return item;
    }
}
