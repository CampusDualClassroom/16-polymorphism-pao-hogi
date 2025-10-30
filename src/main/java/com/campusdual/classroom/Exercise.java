package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise {

    public static void main(String[] args) {
        Plane plane = new Plane("Boeing 737");
        Tractor tractor = new Tractor(3500);

        plane.start();
        plane.fly();
        plane.maintenance();
        plane.land();
        plane.stop();

        System.out.println("---------------");

        tractor.start();
        tractor.forward();
        tractor.backward();
        tractor.maintenance();
        tractor.stop();
    }
}