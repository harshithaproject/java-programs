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
public class Reversepalin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String arr[]=sentence.split(" ");
        String reverse="";
        for(int i=arr.length;i>=0;i--){
            reverse+=arr[i].charAt(i);
        
        System.out.println(reverse);
        reverse="";
        }
//        int i=0;
//            for(int j=0;j<arr[i].length();j++){
//                for(int k=arr[i].length()-1;k>=0;k--){
//                    reverse+=arr[i].charAt(j);
//                    
//                }
//            }
//            sSystem.out.println(reverse);
//                for(int k=arr[i].length()-1;k>=0;k--){
//                              char ch[]=new char[arr[i].charAt(k)];
//                              for(int j=0;j<ch.length;j++){
//                                  reverse=reverse+arr[i].charAt(k);
////                              System.out.print(ch[j]);
//       System.out.print(reverse);
//
//                              }
                
        }
        
        
    }
    

//        String reverse=null;
////   for(int i=sentence.length()-1;i>=0;i--){
////          System.out.print(sentence.charAt(i));
////        }
//         String arr[]=sentence.split(" ");
//            for(int i=0;i<arr.length;i++){
////            for(int j=arr.length-1;j>=0;j--){
////        System.out.println(arr[i]);
//            for(int j=arr[i].length()-1;j>=0;j--){
//                
//            System.out.print(arr[i].charAt(j));
//            
//        }
////        }
//}
    
