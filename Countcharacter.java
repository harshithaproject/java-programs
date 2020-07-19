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
public class Countcharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter a word:");
        String word=sc.next();
        if(word.is)
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
