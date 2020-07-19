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
public class Pan {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the PAN no:");
        String pan=sc.next();
        int count=0;
        if(pan.length()!=10){
            System.out.println("Invalid PAN no");
        }
        else{
            char ch[]=pan.toCharArray();
            for(int j=0;j<ch.length;j++){
            for(int i=0;i<5;i++){
                if(ch[i]>='A' && ch[i]<='Z'){
//                   System.out.println("Valid PAN");
                    count++;
//                    System.out.println(count);
                }
                }
            for(int i=5;i<9;i++){
                if(ch[i]>='0' && ch[i]<='9'){
//                    System.out.println("Valid Pan no");
                    count++;                  
//                    System.out.println(count);

                }
            }
            if(ch[9]>='A' && ch[9]<='Z'){
//                System.out.println("Valid PAn");
                    count++;
//                                        System.out.println(count);
            }
        }
            if(count==100){
                System.out.println("Valid PAN No");
            }
            else{
                            System.out.println("Invalid PAN no");

            }
        }
    }
}
