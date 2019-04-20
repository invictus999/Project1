package cn.itcast.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//单行注释
public class HelloWorld {
    public static final int COUNT=10;
    public static void main(String[] args) {
        System.out.println("hello world!!");
        ArrayList arrayList = new ArrayList();
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.method();
        Date date = new Date();
        String string = date.toLocaleString();
        System.out.println(string);

    }

    public void method() {
        String s = new String("123");
        System.out.println(s);
        System.out.println(s);
    }
    public void method1(){
        try {
            FileInputStream fileInputStream=new FileInputStream("l.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
