package org.example.defaultmethod;

public class Test implements GreetExt,Greeting{
    //default method can be overridden in it's implementing class
    public void greet(){
        System.out.println("Hello from this implemented class");
    }
    public static void main(String[] args) {
        new Test().greet();
        //Hello from B will be print
        //explanation - as B is extending the interface so bascially it's overwriting the method so it will get's printed


    }
}
