package com.lyx.ag.collections.convert;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author : liyixiang
 * @Date : 2019/5/9
 * @Description :
 *  list to map 转换器
 */

public class List2MapConvertor {

    public Map<Integer,DemoBean> list2map(List<DemoBean> list){
        //Map<Integer, T> result = list.stream().collect(Collectors.toMap(T::getId, T::getName));
        return null;
    }
}

@Data
class DemoBean {

    private int id; //key
    private String name;
    private List<Integer> integerList;
}
