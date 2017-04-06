package com.task_one.action;

import static java.lang.Math.*;
import static java.lang.Math.pow;

import com.task_one.entity.Trangle;
import com.task_one.entity.Point;

/**
 * Created by Andrew on 08.12.2016.
 */
public class Calculations {
    public static double perimeterOfTrangle(Trangle trangle) {
        double p12 = lengthOfLine(trangle.getP1(), trangle.getP2());
        double p23 = lengthOfLine(trangle.getP2(), trangle.getP3());
        double p13 = lengthOfLine(trangle.getP1(), trangle.getP3());
        return p12 + p13 + p23;
    }

    public static double spaceOfTrangle(Trangle trangle) {
        double a = lengthOfLine(trangle.getP1(), trangle.getP2());
        double b = lengthOfLine(trangle.getP2(), trangle.getP3());
        double c = lengthOfLine(trangle.getP1(), trangle.getP3());
        double p = perimeterOfTrangle(trangle) / 2;
        double s = sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static double lengthOfLine(Point one, Point two) {
        double a = abs(one.getX() - two.getX());
        double b = abs(one.getY() - two.getY());
        double c = sqrt(pow(a, 2) + pow(b, 2));
        return c;
    }
}
