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
public class Alternatearray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0,diff=0,max_diff=0,a=0,b=0;
        int size=sc.nextInt();
        if(size<=0)
            System.out.println("Invalid Input");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<=0){
                count++;
            }
        }
        if(count>0)
            System.out.println("Invalid Input");
        else{
        for(int i=0;i<size;i++){
            for(int j=i/2;j<size;j=j++){
                max_diff=Math.abs(arr[i]-arr[j]);
                if(max_diff>diff){
                    diff=max_diff;
                    a=i;
                    b=j;
                }
            }
        }
        
        System.out.println(a+" "+b);
    }
    }
    
}
