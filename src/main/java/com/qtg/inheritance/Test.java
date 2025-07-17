package com.qtg.inheritance;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("i5","8GB","SSD","Lenovo");
        NotePad notepad = new NotePad("i7","4GB","SSD","white");
        System.out.println(pc.showInfo());
        System.out.println(notepad.showInfo());
    }
}
