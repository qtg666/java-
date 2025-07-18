package com.qtg.Collection;

import java.util.ArrayList;
import java.util.List;
/*
    List中元素有序，存放顺序和取出顺序一致，且元素可重复。
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        //List支持索引，使用get方法
        System.out.println(list.get(1));

        //add(索引,元素) 在索引位置插入元素
        list.add(1,"maodie");
        System.out.println(list.get(1));

        //addAll(索引,集合)同理
        //indexOf 返回某元素第一次出现的索引
        System.out.println(list.indexOf("maodie"));

        //remove(索引) 删除指定位置的元素
        //set(索引，元素) 将索引位置的元素替换为指定元素
        list.set(1,"maodie_sidiaole");
        System.out.println(list.get(1));

        //subList(起始索引，终止索引) 返回索引范围内的子集合
        System.out.println(list.subList(0,2));//前闭后开
    }
}
