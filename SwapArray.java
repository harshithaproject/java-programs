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
public class SwapArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in first array:");
        int size1=sc.nextInt();
        if(size1<=0){
            System.out.println("Invalid range");
            System.exit(0);
        }
        int arr1[]=new int[size1];
        System.out.println("Enter the elements in first array:");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the number of elements in second array:");
        int size2=sc.nextInt();
        if(size2<=0){
            System.out.println("Invalid range");
            System.exit(0);
        }
        else if(size2!=size1){
            System.out.println("Unable to swap size differs");
            System.exit(0);
        }
        int arr2[]=new int[size2];
        System.out.println("Enter the elements in first array:");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i = 0; i < size1; i++)
		{
		    arr1[i] = arr1[i] + arr2[i];
		    arr2[i] = arr1[i] - arr2[i]; 
		    arr1[i] = arr1[i] - arr2[i];
		}
        System.out.println("The first array after swapping is:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("The second array after swapping is:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
