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
public class Temperature {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=5;
        int input[][]=new int[1][size+1];
                    for(int j=1;j<=size;j++){
            input[0][j]=sc.nextInt();
        }
                    System.out.println("Dry temperature");
                    for(int j=1;j<=size;j++){
                        if(input[0][j]>30)
                        {
                           System.out.print(j+"  ");
                        }
                    }
                    System.out.println();
                    
                        for(int j=1;j<=size;j++){
                        if(input[0][j]>30)
                        {
                           System.out.print(input[0][j]+" ");
                        }
                    }
                    System.out.println();
                    System.out.println("Warm temperature");
                    for(int j=1;j<=size;j++){
                        if(input[0][j]>20 && input[0][j]<=30)
                        {
                           System.out.print(j+"  ");
                        }
                    }
                    System.out.println();
                    
                        for(int j=1;j<=size;j++){
                        if(input[0][j]>20 && input[0][j]<=30)
                        {
                           System.out.print(input[0][j]+" ");
                        }
                    }
                    System.out.println();
                    System.out.println("Cool temperature");
                    for(int j=1;j<=size;j++){
                        if(input[0][j]<=20)
                        {
                           System.out.print(j+"  ");
                        }
                    }
                    System.out.println();
                    
                        for(int j=1;j<=size;j++){
                        if(input[0][j]<=20)
                        
                           System.out.print(input[0][j]+" ");
                        }
                    }
        
    }
