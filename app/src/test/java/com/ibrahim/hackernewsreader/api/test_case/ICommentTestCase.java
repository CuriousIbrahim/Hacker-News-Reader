package com.ibrahim.hackernewsreader.api.test_case;

import com.ibrahim.hackernewsreader.api.test_case.base.IItemTestCase;

public interface ICommentTestCase extends IItemTestCase {
    void check_parent();

    void check_descendants();

    void check_kids();
}
