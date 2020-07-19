/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.lang.Math;
/**
 *
 * @author activ
 */
public class Doubletable {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int input;
       int table=0;
       int result=0;
       int count=0;
       input=sc.nextInt();
       if(input<0){
           System.out.println("Bamboo height cannot be negative");
       }
       else if(input==0){
           System.out.println("Bamboo height cannot be zero");
       }
       else if(input>=10000){
           System.out.println("Bamboo height cannot be more than 10000 feet");
       }
       else if(input%3 !=0 && input%2!=0) {
        System.out.println("Invalid Input");
       }
       else if(input%3 ==0 && input%2==0) {
           int temp=input;
           while(temp%2==0){
           
           temp=temp/2;
           count++;
           }
                         System.out.println("It will take "+count+" years for the Bamboo tree to reach a height " +input+ " 1feet");

       }
           
       //boolean flag=false;
       /*for(int i=0;i<=10;i++){
        table= (int) Math.pow(2,i);
         result=3*table;
         count++;
         //int value=(int)result;
       System.out.println(result);
      System.out.println(count); */
       else{     
                      System.out.println("Invalid Input");

       } 
       }
       }
  

