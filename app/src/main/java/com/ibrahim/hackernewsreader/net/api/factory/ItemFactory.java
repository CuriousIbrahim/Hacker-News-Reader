package com.ibrahim.hackernewsreader.net.api.factory;

import com.ibrahim.hackernewsreader.model.Comment;
import com.ibrahim.hackernewsreader.model.JobPost;
import com.ibrahim.hackernewsreader.model.PollOption;
import com.ibrahim.hackernewsreader.model.PollPost;
import com.ibrahim.hackernewsreader.model.Story;
import com.ibrahim.hackernewsreader.model.base.CommentablePost;
import com.ibrahim.hackernewsreader.model.base.Item;
import com.ibrahim.hackernewsreader.model.base.Post;
import com.ibrahim.hackernewsreader.net.api.model.HNItem;
import com.ibrahim.hackernewsreader.net.api.model.Type;

public class ItemFactory {

    public static Item makeItem(HNItem hnItem) {
        Item item = null;

        if (hnItem.isStory() || hnItem.isJob() || hnItem.isPoll()) {
            item = makePost(hnItem);
        } else {
           if (hnItem.isComment()) {
               item = new Comment();
               ((Comment) item).setDescendants(hnItem.getDescendants());
               ((Comment) item).setKids(hnItem.getKids());
           } else if (hnItem.isPollOpt()) {
               item = new PollOption();
               ((PollOption) item).setPoll(hnItem.getPoll());
               ((PollOption) item).setScore(hnItem.getScore());
           }
        }

        setItemVars(hnItem, item);

        return item;
    }

    public static Post makePost(HNItem hnItem) {

        Post post = null;

        if (hnItem.isStory()) {
            post = new Story();
            ((Story) post).setUrl(hnItem.getUrl());
        } else if (hnItem.isJob()) {
            post = new JobPost();
            ((JobPost) post).setUrl(hnItem.getUrl());
        } else if (hnItem.isPoll()) {
            post = new PollPost();
            ((PollPost) post).setParts(hnItem.getParts());
        }

        if (post instanceof CommentablePost) {
            ((CommentablePost) post).setDescendants(hnItem.getDescendants());
            ((CommentablePost) post).setKids(hnItem.getKids());
        }

        post.setTitle(hnItem.getTitle());
        post.setScore(hnItem.getScore());

        setItemVars(hnItem, post);

        return post;
    }

    private static void setItemVars(HNItem hnItem, Item item) {
        item.setId(hnItem.getId());
        item.setBy(hnItem.getBy());
        item.setTime(hnItem.getTime());
        item.setText(hnItem.getText());
    }
}
