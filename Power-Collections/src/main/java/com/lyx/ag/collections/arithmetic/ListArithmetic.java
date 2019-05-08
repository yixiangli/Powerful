package com.lyx.ag.collections.arithmetic;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author : liyixiang
 * @Date : 2019/5/8
 * @Description :
 *      List集合运算
 */
public class ListArithmetic {

    //交集
    public List<String> intersection(List<String> list1, List<String> list2){
        return list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
    }

    //差集(list1 - list2)
    public List<String> difference(List<String> list1, List<String> list2){
        return list1.stream().filter(item -> !list2.contains(item)).collect(Collectors.toList());
    }

    //并集
    public List<String> union(List<String> list1, List<String> list2){
        List<String> listAll = list1.parallelStream().collect(Collectors.toList());
        List<String> listAll2 = list2.parallelStream().collect(Collectors.toList());
        listAll.addAll(listAll2);
        return listAll;
    }

    //去重
    public List<String> distinct(List<String> list){
        return list.stream().distinct().collect(Collectors.toList());
    }

}
