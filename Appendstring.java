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
public class Appendstring {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String sentence=sc.nextLine();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int size=n1+n2;
        for(int i=1;i<size+1;i++){
           sentence=sentence.concat(sentence);

        }
            if(sentence.charAt(n1)==sentence.charAt(n2)){
                System.out.println("Same");
            }
            else{
                System.out.println(" not Same");
            }}
        
    }

