package com.driver;


public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();

        //setting the name
        rw.setName("sanjay");

        //getting the name
        System.out.println(rw.getName());
    }
}