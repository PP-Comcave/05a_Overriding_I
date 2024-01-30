package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        Child ch = new Child();
        Parent pa = new Parent();
        output(ch.sayHello());

        output(ch.sayHello("helloooo"));
        output(pa.sayHello());



    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

