package com.qtg.Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    泛型
    1.
    泛型是一种可以表示数据类型的数据类型.
    比如一个泛型E，可以给他赋Integer，也可以赋String。。。也可以赋自定义类型Dog
    2.声明语句
    interface 接口名<T>{}
    class 类名<A,B,C>{}
    【上面的泛型（字母）只能用引用类型，不能用基本数据类型】
    3.实例化
    List<String> list1 = new ArrayList<String>();
    Iterator<Dog> iterator = dogs.iterator();
    也可以用这种形式：List<String> list1 = new ArrayList<>();【简写】
    4.注意：
    给泛型指定具体类型后，可传入指定的类型或其子类类型
    5.好处
    ①编译时，检查添加元素的类型，提高了安全性
    ②减少了类型转换次数，提高了效率
      不使用泛型时：Dog->存入->Object->取出->Dog  放入ArrayList中时先转为Object，取出时转回Dog
      使用泛型时：Dog->存入->Dog->取出->Dog
    ③可以保证如果程序在编译时没有发出警告，那么在运行时就不会出现ClassCastException异常
 */
public class Generics {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("MAODIE",0,new MyDate(1,2,1999)));
        list.add(new Employee("PANGMAO",500000,new MyDate(1,12,2000)));
        list.add(new Employee("MANBO",100,new MyDate(1,4,2001)));

        System.out.println(list);

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if(emp1 instanceof Employee && emp2 instanceof Employee){

                }
                else{
                    return 0;
                }
            }
        })
    }

}
