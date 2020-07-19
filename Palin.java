/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
 *
 * @author activ
 */
public class Palin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int mod;
        while(num>0){
            mod=num%10;
            sum=(sum*10)+mod;
            num=num/10;
        }
      System.out.println(sum);
    }
}
