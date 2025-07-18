package com.qtg.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
    Set接口基本介绍：
    1.无序，没有索引。【但是取出的顺序是固定的】
    2.不允许重复元素，所以最多包含一个null。（添加重复元素时，自动去重）

 */
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add("hajimi");
        set.add("dagoujiao");
        set.add(888);
        System.out.println(set);

        //两种遍历方式：（不可用索引）
        //1.迭代器
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //2.增强for
        for(Object obj:set){
            System.out.println("for:" + obj);
        }

        //其余方法大致就是Collection的那些
    }
}
