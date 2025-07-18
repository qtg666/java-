package com.qtg.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //add添加单个元素
        list.add("hajimi");
        list.add(666);
        list.add("manbo");
        System.out.println(list);

        //remove删除指定元素
        list.remove(0);//删除第一个元素
        list.remove((Integer)666);//删除指定内容的元素
        System.out.println(list);

        //contains判断元素是否存在
        System.out.println(list.contains(666));
        System.out.println(list.contains("manbo"));

        //size获取元素个数
        System.out.println(list.size());

        //isEmpty判断是否为空
        System.out.println(list.isEmpty());

        //clear清空
        list.clear();

        //addAll添加多个元素(参数是一个集合)
        ArrayList list2 = new ArrayList();
        list2.add("dingdongji");
        list2.add(250);
        list.addAll(list2);
        System.out.println(list2);

        //containsAll查找多个元素是否都存在（参数是一个集合）
        System.out.println(list.containsAll(list2));

        //removeAll删除多个元素（参数是一个集合）
        list.removeAll(list2);
        System.out.println(list);

        /*
        Collection接口可以用Iterator迭代器进行遍历
         */
        Iterator iterator = list2.iterator();//创建一个集合的迭代器
        //hasNext()用来判断集合是否还有下一个元素
        while(iterator.hasNext()){
            System.out.println(iterator.next());//next()作用：1.向下移一个元素；2.将下移后集合位置上的元素返回。
        }
        //⭐迭代完一次后，迭代器的指针指在最后一个元素，如需要重新迭代，需要重置迭代器
        iterator = list2.iterator();
        //开始新一次迭代
        while(iterator.hasNext()){
            System.out.println(iterator.next());//next()作用：1.向下移一个元素；2.将下移后集合位置上的元素返回。
        }

        /*
        for循环增强：[就是一个简化版的迭代器]
        for(元素类型 元素名:集合或数组名){
            访问元素
        }

         */
        for(Object elem: list2){
            System.out.println(elem);
        }
    }
}
