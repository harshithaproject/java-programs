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
public class Countrepeat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String arr[]=sentence.split(" ");
        for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
        
        }
            for(int j=k+1;j<arr.length;j++){
                
                    System.out.println(arr[j]);
                
       
        }
    }
}
