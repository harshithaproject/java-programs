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
public class Reversesentence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        int[] occurence=new int[sentence.length()];
        int min=occurence[0];
        char val='0';
        char ch[]=sentence.toCharArray();
        for(int i=0;i<sentence.length();i++){
            occurence[i]=1;
            for(int j=i+1;j<sentence.length();j++){
                if(ch[i]==ch[j]){
                    occurence[i]++;
                    ch[j]='0';
//                                    System.out.println(occurence[i]);
                }
            
            }            
        }
    for(int i=0;i<occurence.length;i++){
       if(ch[i]!='0' && ch[i]!=' '){
                       occurence[i]=1;
                      System.out.println(min);
            if(occurence[i]>min){ 
                min=occurence[i];
                                                       System.out.println(occurence[i]);
                                       System.out.println(min);

               val=ch[i];
                
           }
        
    }
    }     
        }
    }   
 
    

