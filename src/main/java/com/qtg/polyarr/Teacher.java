package com.qtg.polyarr;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String say(){
        return super.say() + "工资为" + salary + "\n";
    }

    public void teach(){
        System.out.println("老师" + getName() + "正在讲课");
    }

}
