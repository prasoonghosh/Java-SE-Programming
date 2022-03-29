package com.example;

class A

{

    int a;

    public void show()

    {



        System.out.println(a);



    }

}

class B extends A

{

    int b;

    public void show()

    {



        System.out.println(b);



    }

}

public class Demo {



    public static void main(String args[]) {

        B obj = new B();



        obj.b = 225;

        obj.b = 125;

        A ob;



        ob = obj;

        ob.show();

    }

}