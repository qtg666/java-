package com.qtg.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map
    1.Map用来保存具有映射关系的数据：键值对
    2.Map中的key和value可以是任何引用类型的数据
    3.key不允许重复
    4.常用String作为key

 */
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();

        //put(键，值) 添加一个元素
        map.put("第一", "pangmao");
        map.put("第二",666);
        map.put("第三","maodie");
        System.out.println(map);
        map.put("第三","maodiesidiaole");//当put已有的key时，相当于替换
        System.out.println(map);

        //remove(键) 根据键删除键值对
        map.remove("第二");
        System.out.println(map);

        //get(键) 根据键获得值
        System.out.println(map.get("第一"));

        //size() 获取元素个数
        System.out.println(map.size());

        //isEmpty() 判断map是否为空
        System.out.println(map.isEmpty());

        //containsKey()
        System.out.println(map.containsKey("第一"));

        //clear() 清空
        //map.clear();
        //System.out.println(map);

        //Map六大遍历方式
        //1.增强for
        for(Object key : map.keySet()){//keySet()方法返回Map对象的所有key
            System.out.println(key + ":" + map.get(key));
        }
        //2.迭代器
        Iterator iterator =  map.keySet().iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();//不单独定义key,而是直接写在下面输出语句里为什么不行？？？？？
            System.out.println(key + ":" + map.get(key));
        }

        //3.把所有value取出，用增强for遍历。（不知道key值了）
        //4.把所有value取出，用迭代器遍历。（不知道key值了）

        //5.通过entrySet来获取，使用增强for遍历
        //⭐调用entrySet方法将map集合转换为set集合，set集合中存放的是Map.Entry<k,v>，因此需要把object向下转型为Map.Entry<k,v>
        //   才可以调用子类的方法，即Entry的getKey与getValue方法
        Set entry_set = map.entrySet();
        for(Object entry : entry_set){
            Map.Entry m = (Map.Entry)entry;//向下转型
            System.out.println(m.getKey() + ":" + m.getValue() );
        }

        //6.通过entrySet来获取，使用迭代器遍历
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
