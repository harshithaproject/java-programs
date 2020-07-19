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
public class Perfectno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<number;i++){
            if(number %i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(sum==number){
            System.out.println("Perfect number");
        }
        else{
                        System.out.println("Not a Perfect number");
        }
    }
}
