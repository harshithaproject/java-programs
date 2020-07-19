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
public class Triangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int side1,side2,side3;
        int a,b,c;
        int result=0;
        System.out.println("Enter the value of side1:");
        side1=sc.nextInt();
        System.out.println("Enter the value of side2:");
        side2=sc.nextInt();
        System.out.println("Enter the value of side3:");
        side3=sc.nextInt();
        
        a=side1+side2;
        b=side2+side3;
        c=side1+side3;
        
              //System.out.println("Sides form a triangle");
                //String s=(a>b)?"Sides form a triangle":"Sides does not form a triangle";
                //result=c>(a>b?a:b)?c:((a>b)?a:b);        
                 //System.out.println();
                 if((side1<=0)||(side2<=0)||(side3<=0)){
                     System.out.println("Invalid input");
                 }
                 
                 else if((a>side3)&&(b>side1)&&(c>side2)){
            System.out.println("Sides form a triangle");
        }
                 
                 
        else{
            System.out.println("Sides does not form a triangle");
        }
                 
    }
            
    
}
