/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author activ
 */
class BaseClass 
 { 
   public  BaseClass()
   { 
     System.out.println("1"); 
   } 
 } 
 class DerivedClass extends BaseClass
{ 
     
public  DerivedClass()
{ 
System.out.println("2"); 
} 
public void method(){
    System.out.println("3");
}
} 
public class ApplicationTester 
{
  public static void main(String[] args)
  { 
    DerivedClass ref = new DerivedClass(); 
    ref.method(); 
    //Line-1 
  }
}