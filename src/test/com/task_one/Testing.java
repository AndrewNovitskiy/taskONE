package test.com.task_one;

import static com.task_one.action.Calculations.*;
import static java.lang.Math.pow;
import static junit.framework.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.google.gson.Gson;
import com.task_one.entity.Point;
import com.task_one.entity.Trangle;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Andrew on 08.12.2016.
 */
public class Testing {
    private static final Logger log = Logger.getLogger(Testing.class);
    private Gson gson = new Gson();

    private Trangle trangle1;
    private Trangle trangle2;
    private Trangle trangle3;
    private Trangle trangle4;

    {
        try {
            trangle1 = gson.fromJson(new FileReader("init\\trangle1.json"), Trangle.class);
            trangle2 = gson.fromJson(new FileReader("init\\trangle2.json"), Trangle.class);
            trangle3 = gson.fromJson(new FileReader("init\\trangle3.json"), Trangle.class);
            trangle4 = gson.fromJson(new FileReader("init\\trangle4.json"), Trangle.class);
        } catch (FileNotFoundException e) {
            log.info(" FileNotFoundException ");
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void testMethod() {
        fail("It's a test fail! Don't worry!");
    }

    @Test
    public void testIsATrangle() {
        assertTrue(spaceOfTrangle(trangle1) != 0);
    }

    @Test
    public void testTrangleIsRight() {
        Trangle trangle = trangle2;
        double a = lengthOfLine(trangle.getP1(), trangle.getP2());
        double b = lengthOfLine(trangle.getP2(), trangle.getP3());
        double c = lengthOfLine(trangle.getP1(), trangle.getP3());
        double hypotenuse;
        double cathetus1;
        double cathetus2;
        if (a > b) {
            cathetus1 = b;
            if (a > c) {
                cathetus2 = c;
                hypotenuse = a;
            } else {
                cathetus2 = a;
                hypotenuse = c;
            }
        } else {
            cathetus1 = a;
            if (b > c) {
                cathetus2 = c;
                hypotenuse = b;
            } else {
                cathetus2 = b;
                hypotenuse = c;
            }
        }
        assertEquals(pow(hypotenuse, 2), pow(cathetus1, 2) + pow(cathetus2, 2), 0);
    }

    @Test
    public void testPerimeterOfTrangle() {
        assertTrue(perimeterOfTrangle(trangle2) == 12);
    }

    @Test
    public void testSpaceOfTrangle() {
        assertTrue(spaceOfTrangle(trangle2) == 6);
    }

    @Test
    public void testLengthOfLine() {
        Point testPointOne = new Point(1, 1);
        Point testPointTwo = new Point(1, 2);
        assertEquals(lengthOfLine(testPointOne, testPointTwo), 1, 0);
    }

    @Test(timeout = 5)
    public void testTimeOut() {
        Point testPointOne = new Point(1, 1);
        Point testPointTwo = new Point(1, 2);
        Point testPointThree = new Point(2.5, 1);
        Point testPointFour = new Point(5, 4);
        testPointOne.setX(0);
        testPointTwo.setX(0);
        testPointThree.setX(0);
        testPointFour.setX(0);
    }

    @Test
    public void testDifferentPointsInTrangle() {
        Trangle trangle = trangle1;
        Point point1 = trangle.getP1();
        Point point2 = trangle.getP2();
        Point point3 = trangle.getP3();
        assertFalse(point1.equals(point2) || point2.equals(point3) || point1.equals(point3));
    }
}
