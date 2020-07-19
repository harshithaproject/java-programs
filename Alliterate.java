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
public class Alliterate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence=sc.nextLine();
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        char chh=Character.toLowerCase(ch);
        int count=0;
        int score=0;
        String [] arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            char ch1=Character.toLowerCase(arr[i].charAt(0));
//            System.out.println(ch1);
            if(ch1==chh)
            {
                count++;
            }
            }
        
        if(count==3){
            System.out.println("Good you get a score of 2");
        }
        else if(count<3){
        System.out.println("No score");
    }
        else if(count>3){
            score=(2*(count-3))+2;
            System.out.println("Good, you get a sore of "+score);
        }
}

}