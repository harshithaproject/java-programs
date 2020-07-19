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
public class Clearance {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=null;
        int price;
        int amount=0;
        int no_of_items;
        double price1=0;
        double price2=0;
        double price3=0;
        double price4=0;
        int number11=0;
        int number22=0;
        int number33=0;
        int number44=0;
        int price11=0;
        int price22=0;
        int price33=0;
        int price44=0;
        System.out.println("Enter the name of the item:");
        name=sc.nextLine();
        System.out.println("Enter the price of the item:");
        price=sc.nextInt();
        System.out.println("Enter the number of items for sale:");
        no_of_items=sc.nextInt();
        System.out.println("Enter the number of items sold on Day1:");
        int number1=sc.nextInt();
        if(number1==no_of_items){
            System.out.println(price);
            System.exit(0);
        }
        System.out.println("Enter the number of items sold on Day2:");
        int number2 =sc.nextInt();
            number22=no_of_items-number1;
            price2=price-(price*0.07);
            
        System.out.println("Enter the number of items sold on Day3:");
        int number3 =sc.nextInt();
            number3=number22-number2;
           
        System.out.println("Enter the number of items sold on Day4:");
        int number4=sc.nextInt();
        
            number4=number3-number2;
            
        System.out.println(name);
        System.out.println("Day No.of items_available Price");
        System.out.println("Day1"+" "+no_of_items+" "+price);
        System.out.println("Day2"+" "+number22+" "+price2);
        System.out.println("Day3"+" "+number3+" "+price3);
        System.out.println("Day4"+" "+number4+" "+price4);
        System.out.println("Total amount of Sales =Rs."+amount);
    }
}
