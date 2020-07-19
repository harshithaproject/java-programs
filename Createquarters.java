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
public class Createquarters {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Months in expanded form:");
        String arr[]=new String[12];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        System.out.println("The four quarters are:");
        System.out.println("First Quarter:");
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Second Quarter:");
    for(int i=3;i<6;i++){
        System.out.println(i);
    }
                System.out.println("Third Quarter:");
for(int i=6;i<9;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Fourth Quarter:");
        for(int j=9;j<12;j++){
           System.out.println(arr[j]);
}
}
    
}