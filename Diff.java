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
public class Diff {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size<3){
            System.out.println("Invalid array size");
            System.exit(0);
        }
        int diff=0;
        int a=0,b=0;
        int max_diff=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int j=i+2;
            if(j>=size){
                break;
            }
            
                max_diff=Math.abs(arr[i]-arr[j]);
               if(max_diff>diff){
                   diff=max_diff;
                   a=i;
                   b=j;
                   j=0;
//                   System.out.println(arr[i]+"-"+arr[j]+"="+max_diff);
               }
            }
        
        
    }
}