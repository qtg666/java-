package com.qtg.polymorphic;
/*
    1.方法的多态：
        通过方法的重载和重写
    2.对象的多态：
        ①一个对象的编译类型和运行类型可以不一致。
        Animal animal = new Dog(); animal的编译类型的Animal，运行类型是Dog
        ②编译类型在定义对象时就确定了，不能改变。
        ③运行类型可以改变
        animal = new Cat(); animal的运行类型改成了Cat
        ④编译类型看定义时等号左边，运行类型看定义时等号右边
    3.多态注意事项：
        ①多态的前提是两个对象存在继承关系

        ②向上转型
        本质：父类的引用指向了子类的对象
        语法：父类类型 引用名 = new 子类类型();
        引用名对应的对象可以访问父类中所有的属性和方法（遵循访问权限），不能访问子类中
        特有的方法。

        ③向下转型
        语法：子类类型 引用名 = (子类类型) 父类引用;
        Cat cat = (Cat) animal;
        只能强转父类的引用，不能强转父类的对象.【即向下转型的前提是向上转型过】
        父类的引用必须指向当前目标类型的对象
        当向下转型后，可以调用子类的所有成员

        ④属性的“重写”
        属性没有重写之说，属性的值看编译类型
        ⑤instanceof用于判断对象的类型是否为某某类型或某某类型的子类型
        System.ou.println(cat instanceof Animal);  输出true

    4.⭐动态绑定机制⭐
    ①当调用对象方法的时候，遵循动态绑定机制，将对象方法与对象的内存地址（运行类型）绑定
    ②当调用对象属性的时候，没有动态绑定机制，在哪声明就在哪使用

    5.多态参数
    方法定义的形参类型为父类类型，实参类型允许为子类类型。




 */
public class poly {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        //animal.miaomiao(); 报错，因为向上转型的对象不能访问子类中特有的成员。

        Cat cat = (Cat) animal;
        cat.eat();
    }
}
