package com.github.app.java;

public class DataClass {
    private String str;
    private short s;
    private int i;

    public DataClass(String str, short s, int i) {
        this.str = str;
        this.s = s;
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }
}
