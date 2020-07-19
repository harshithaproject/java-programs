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
public class Unique {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence=sc.nextLine();
        char ch1='\0';
        char ch2='\0';
        for(int i=0;i<sentence.length();i++){
            for(int j=sentence.length()-1;j>=0;j--){
                if(sentence.charAt(i)!=sentence.charAt(j)){

            System.out.println(sentence.charAt(i));
        }
            }
        }
        System.out.println("Unique characters:");
        
    }
}
