package com.qtg.inheritance;

public class Computer {
    String CPU;
    String memory;
    String disk;

    public Computer() {

    }

    public Computer(String CPU, String memory, String disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String showInfo(){
        return "CPU: " + CPU + "\nMemory: " + memory + "\nDisk: " + disk + "\n";
    }
}
