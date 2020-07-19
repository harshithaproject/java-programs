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
public class Binary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int size=sc.nextInt();
        int q =sc.nextInt();
        int arr[]=new int[size+1];
        for(int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print(1+" ");
        int x=sc.nextInt();
        System.out.print(0+" ");
        int l=sc.nextInt();
        int r=sc.nextInt();
        for(int i=1;i<arr.length;i++){
            if(i==x && arr[x]==0){
                arr[x]=1;
            }else if(i==x && arr[x]==1){
                arr[x]=0;
            }
            
        }
        for(int i=l;i<=r;i++){
            if(arr[i]==1){
                sum=sum+4;
            }
        }
    }
    
}
