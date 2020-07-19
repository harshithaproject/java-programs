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
public class Checknegative {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int array[]=new int[size];
        int sum=0;
        int count=0;
        int factorial=1;
        int temp=0;
        System.out.println("Enter the elements:");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            if(!(array[i]>0 && array[i]<=9)){
                count++;
                System.out.println(count);
            }
        }
        if(count==size){
            System.out.println("No positive");
        }
    }
}
