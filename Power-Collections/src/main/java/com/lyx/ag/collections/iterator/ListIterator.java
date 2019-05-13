package com.lyx.ag.collections.iterator;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.List;

/**
 * @Author : liyixiang
 * @Date : 2019/5/14
 * @Description :
 *      List迭代器，主要提供删除元素功能（并发安全性）
 */

public class ListIterator {

    public List<DemoBean> itreator(List<DemoBean> tobeOptList,String condition) {

        for (Iterator<DemoBean> it = tobeOptList.iterator(); it.hasNext(); ) {
            DemoBean demoBean = it.next();
            if (null != demoBean && StringUtils.isNoneBlank(condition)) {
                if (condition.equals(demoBean.getName())) {
                    it.remove();
                }
            }
        }
        return tobeOptList;
    }

}

@Data
class DemoBean {

    private Integer id;
    private String name;

}
