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
public class Aliteration {
    public static void main(String args[]){
        int score=2;
        String str="Jack and Jill";
        String parts[]=str.split(" ");
//        for (int i=0;i<parts.length;i++){
            if(parts.length==3){
                System.out.println("score=2");
            }
            else if(parts.length>3){
               int y= (parts.length-3);
                score=score+(2*y);
                                System.out.println("score"+score);

            //}
        }
    }
    
}
