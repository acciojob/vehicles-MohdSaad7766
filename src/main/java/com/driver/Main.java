package com.driver;

public class Main {
    public static void main(String[] args) {
//        F1 f1 = new F1("BMW", false);
//        f1.move(100, 30);
//        f1.steer(60);
//        f1.stop();
//        f1.changeSpeed(30, 100);

        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }
}