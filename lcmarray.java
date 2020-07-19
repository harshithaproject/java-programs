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
public class lcmarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int temp[]=new int[arr.length];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    temp[j]++;
                    arr[j]='0';
                }
            }
        }
            for(int i=0;i<arr.length;i++){
            if(arr[i]!=' ' && arr[i]!='0'){
            if(temp[i]==0){
                System.out.println(arr[i]);
            }
            }   
        }
        
    }
}
