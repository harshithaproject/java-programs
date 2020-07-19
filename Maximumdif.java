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
public class Maximumdif {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int count=0;
        int diff=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max =arr[1]-arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<=0){
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){
         if((i!=arr.length-1) && (j!=arr.length)){
                    if(arr[j]-arr[i]>max){
                max=arr[j]-arr[i];
                    }
        }
        }
            }
            System.out.print(max);

        

        if(count>0 || size<=0){
            System.out.println("Invalid range");
        }
    }
}
