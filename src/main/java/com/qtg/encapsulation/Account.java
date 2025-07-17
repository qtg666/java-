package com.qtg.encapsulation;

public class Account {
    private String name;
    private double salary;
    private String password;

    public Account(){

    }
    public Account(String name,double salary,String password){
        this.setName(name);
        this.setSalary(salary);
        this.setPassword(password);
    }

    public String getName(){

        return name;


    }
    public double getSalary(){
        return salary;

    }
    public String getPassword(){

        return password;

    }
    public void setName(String name){
        if(name.length()==2 || name.length()==3 || name.length()==4){
            this.name=name;
        }else{
            System.out.println("Invalid name!");
            this.name="maodie";
        }
    }
    public void setSalary(double salary){
        if(salary>20){
            this.salary=salary;
        }else{
            System.out.println("Invalid salary!");
            this.salary=100;
        }

    }
    public void setPassword(String password){
        if(password.length() ==6){
            this.password=password;
        }else{
            System.out.println("Invalid psw!");
            this.name="123456";
        }

    }
    public void Info(){
        System.out.println("Name: "+this.getName()+"salary:"+this.getSalary()+"password:"+this.getPassword());
    }
} 
