package com.github.app.java;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;


public class JavaApp {

    public static void main(String[] args) {
        DataClass dc = new DataClass("some string here", (short) 5, 2);

        System.out.println(ClassLayout.parseClass(DataClass.class).toPrintable());
        System.out.println(ClassLayout.parseClass(DataClass.class).toPrintable(dc));

        System.out.println(GraphLayout.parseInstance(dc).toPrintable());
        System.out.println(GraphLayout.parseInstance(dc).toFootprint());
    }
}
