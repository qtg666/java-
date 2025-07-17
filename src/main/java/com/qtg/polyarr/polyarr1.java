package com.qtg.polyarr;
/*
    多态数组
    数组的定义类型为父类型，里面的元素为子类型
 */
public class polyarr1 {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("hajimi",18);
        people[1] = new Student("manbo",19,0);
        people[2] = new Student("maodie",20,60);
        people[3] = new Teacher("pangmao",21,500000);
        people[4] = new Teacher("dingdongji",22,0);

        for(int i = 0; i<people.length; i++){
            System.out.println(people[i].say());
            if(people[i] instanceof Student){
                Student student = (Student) people[i];
                student.study();
            }
            else if(people[i] instanceof Teacher){
                Teacher teacher = (Teacher) people[i];
                teacher.teach();
            }
        }

    }
}
