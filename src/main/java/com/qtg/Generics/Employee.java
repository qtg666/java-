package com.qtg.Generics;

public class Employee {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee() {

    }
    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\n{" + "name=" + name + "sal=" + sal + "birthday=" + birthday + "}";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSal() {
        return sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
    public MyDate getBirthday() {
        return birthday;
    }
    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
