

 

import java.io.*;

interface Printable

{

    void print();

}

  

interface Showable

{

    void show();

}

  

// class implements both interfaces

// and provides implementation to the method.

 public class Test implements Printable, Showable

{

    @Override

    public void print()

    {

        System.out.println("print method");

    }

  

    @Override

    public void show()

    {

        System.out.println("show method");

    }
     public static void main (String[] args)

    {

        Test t1 = new Test();

  

        // calling the method implemented

        // within the class.

        t1.print();

        t1.show();

   

    }
 }
