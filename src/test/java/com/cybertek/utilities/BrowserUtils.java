package com.cybertek.utilities;

public class BrowserUtils {
    public static void sleep(int second) {
        second += 1000;
        //1 sec = 1000 milli sec
        //1*1000 = 1000;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Something happpened with the sleep method");
            e.printStackTrace();
        }

    }
}
