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
public class Mindtree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[no];
        System.out.println("Enter elements");
        for(int i=0;i<no;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
            System.out.println(arr[4]);
//        }
    }
}
