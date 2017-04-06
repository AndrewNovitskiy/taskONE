package com.task_one.entity;

/**
 * Created by Andrew on 08.12.2016.
 */
public class Trangle {
    private String name;
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Trangle(String name, Point p1, Point p2, Point p3, Point p4) {
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "Trangle{" +
                "name='" + name + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }

}
