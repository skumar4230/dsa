package org.example.functional_interface;

@FunctionalInterface
interface B {
    void test();
}
@FunctionalInterface
interface Add {
    void test(int a,int b);
}


public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("used Annonymous Inner class");

            }
        };
        obj.show();
        B b = new B() {
            public void test() {
                System.out.println("annonymous Inner class B");
            }
        };
        b.test();
        //now with lambda expression
        //step 1 - no need to specify new keyword as there is no args so () is empty then
        //step2- it's a functional interface so we know it only have one unimplementated abstract method so no need to specify method name also
        //step3- only implement the method
        B obj1 = () -> System.out.println("using LambdaExpression");
        obj1.test();
        //let's have another example
        Add add =(x,y) -> System.out.println(x+y);
        add.test(45,56);

    }
}
