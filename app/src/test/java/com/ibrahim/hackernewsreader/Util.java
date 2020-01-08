package com.ibrahim.hackernewsreader;

import java.util.List;

public class Util {

    public static long[] listToArrayLong(List<Long> list) {
        return list.stream().mapToLong(l -> l).toArray();
    }
}
