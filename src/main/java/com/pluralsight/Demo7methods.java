package com.pluralsight;

public class Demo7methods {

    public static void main(String[] args){
        System.out.println("Welcome!");
        foo();
        foo();
        moo();
        foo();
        foo();

    }


    public static void foo(){
        System.out.println("the secret word is: Foo");
        moo();
    }

    public static void moo(){
        System.out.println(("Moo"));
    }
}
