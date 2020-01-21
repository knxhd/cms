package com.knxhd.cms.common;

import java.util.Collection;
import java.util.List;

/**
 * @ClassName CollectionUtils
 * @description
 * @author: tianluhua
 * @date 2020/1/21 10:32
 */
public class CollectionUtils {

    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static boolean isNotEmpty(List list) {
        return !isEmpty(list);
    }
}
