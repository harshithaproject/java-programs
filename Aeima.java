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
public class Aeima {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of courses:");
        int number=sc.nextInt();
        if(number<1){
            System.out.println("Invalid no. of courses");
            System.exit(0);
        }
        int marks[]=new int[number];
        String sub[]=new String[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter name of the subject and marks respectively");
            sub[i]=sc.nextLine();
            sc.nextLine();      
            marks[i]=sc.nextInt();
            if(marks[i]<0 || marks[i]>100){
                System.out.println("Invalid mark");
                System.exit(0);
            }
        }
        for(int j=0;j<number;j++){
            if(marks[j]>=80){
                System.out.println("The courses you have cleared are:");
                System.out.println(sub[j]+" "+marks[j]);
            }
        }
        
    }
}
