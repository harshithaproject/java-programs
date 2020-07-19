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
public class Correspondingarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int z=0;
        int sum[];
        int size=0;
        
        System.out.println("Enter the size of the first array:");
        int size1=sc.nextInt();
        int first[]=new int[size1];
        sum = new int[size1];
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<size1;i++){
        first[i]=sc.nextInt();
    }
        
       
        System.out.println("Enter the size of the second array:");
        int size2=sc.nextInt();
        int second[]=new int[size2];
        
        System.out.println("Enter the elements of second array:");
        for(int i=0;i<size2;i++){
        second[i]=sc.nextInt();
    }
//        if(size1>size2){
//            size=size1;
//        }
//        else if(size2==size1){
//             size=size2;
//        }
//        else{
//            size=size2;
//        }
               for(int i=0;i<size1;i++){
                       sum[i]=first[i]+second[i];
                       System.out.println(sum[i]);
                           }
               }
         
    }

