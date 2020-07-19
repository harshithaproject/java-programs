/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author activ
 */
class Test
{ 
static
{ 
      System.out.println("A"); 
}
}
 public class Demo
{
 static
{
 System.out.println("B"); 
}
public static void main(String[] args) 
{ 
  Test t=new Test(); 
} 
static
{ 
 System.out.println("D"); 
}
}

