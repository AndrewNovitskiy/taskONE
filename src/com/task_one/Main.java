package com.task_one;

import com.google.gson.Gson;
import com.task_one.entity.Trangle;
import org.apache.log4j.Logger;
import test.com.task_one.Testing;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Andrew on 27.01.2017.
 */
public class Main {
    private static final Logger log = Logger.getLogger(Testing.class);
    private static Gson gson = new Gson();

    private static Trangle trangle1;


    public static void main(String[] args) {
        try {
            trangle1 = gson.fromJson(new FileReader("init\\trangle1.json"), Trangle.class);

        } catch (FileNotFoundException e) {
            log.info(" FileNotFoundException ");
            e.printStackTrace();
        }
    }
}
