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
public class Twowordssame {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    String word1=sc.nextLine();        
    String word2=sc.nextLine();        

//        String word2=sc.nextLine();
        for(int i=0;i<word1.length();i++){
        String a=word1.substring(i, i+1);
        while(word1.indexOf(a)!=word1.lastIndexOf(a)){
            word1.deleteCharAt(word1.lastIndexOf(a));
        }
    }
        for(int i=0;i<word2.length();i++){
        String a1=word2.substring(i, i+1);
        while(word2.indexOf(a1)!=word2.lastIndexOf(a1)){
            word2.deleteCharAt(word2.lastIndexOf(a1));
        }
    }
        System.out.println(word1);
        System.out.println(word2);
        
        String word11=word1;
        String word22=word2;
       char[] ch=word11.toLowerCase().toCharArray();
        char[] ch2=word22.toLowerCase().toCharArray();
//        StringBuilder s=new StringBuilder(sc.nextLine());        
//    //String s=new String();
//    
      Arrays.sort(ch);
      Arrays.sort(ch2);
                  System.out.println(ch);
                  System.out.println(ch2);
                    String helloString = new String(ch);
                    String helloString1 = new String(ch2);  

    
        if(helloString.equals(helloString1)){
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }
//       for(int i=0;i<ch.length;i++)
//       {
//           if(ch[i]==ch[i+1]){
//               ch[j++]=ch[i];
//           }
//           System.out.print(ch[i]);
//       }
//        word11 = word1;
      

    }
    
}
