/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.math.*;
/**
 *
 * @author activ
 */
public class Perfectsq {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        double product=number*number;
        double root=Math.sqrt(product);
        if(root==number)
            System.out.println("Perfect square");
        else
            System.out.println("Not a Perfect square");
    }
}
