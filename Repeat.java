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
public class Repeat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.next();
        char[] sentencechar=sentence.toCharArray();
        for(int i=0;i<sentencechar.length;i++){
            if(!(sentencechar[i]>='a' && sentencechar[i]<='z')|| (sentencechar[i]>='A' && sentencechar[i]<='Z')){
                System.out.println("Invalid sentence");
                System.exit(0);
                }
        }
        char ch=sc.next().charAt(0);
        if(!(ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println("Invalid character");
            System.exit(0);
        }
        int count=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Count is "+count);
    }
}
