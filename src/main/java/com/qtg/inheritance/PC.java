package com.qtg.inheritance;

public class PC extends Computer{
    private String brand;

    public PC(String CPU, String memory, String disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String showInfo(){
        return super.showInfo() + ", brand: " + brand + "\n";
    }


}
