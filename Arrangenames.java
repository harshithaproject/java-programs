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
public class Arrangenames {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int size=sc.nextInt();
        if(size<0){
            System.out.println("Invalid Input");
            System.exit(0);
          }
        String arr[]=new String[size];
        System.out.println("Enter the names:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        System.out.println("The sorted name list is:");
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr,Collections.reverseOrder());
            System.out.println(arr[i]);
        }
           
    }
}
