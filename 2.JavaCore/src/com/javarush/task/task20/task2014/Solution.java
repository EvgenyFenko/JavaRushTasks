package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("/home/evgeny/file1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        Solution saveObject1 = new Solution(22);
        Solution saveObject2 = new Solution(20);

        objectOutputStream.writeObject(saveObject1);
        objectOutputStream.writeObject(saveObject2);



        InputStream inputStream = new FileInputStream("/home/evgeny/file1.txt");


        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
