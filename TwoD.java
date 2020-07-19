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
public class TwoD {
    public void Totaldistance(double[][]distance,String[] name){
        double[] total=new double[4];
        for(int i=0;i<4;i++){
         for(int j=0;j<7;j++){
             total[i]=distance[0][j];
             total[i]=distance[1][j];
             total[i]=distance[2][j];
             total[i]=distance[3][j];
         
                      System.out.println(total[i]);
         }

        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String names[]={"David","Charles","Antony","leo"};
        double arr[][]=new double[4][7];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            arr[i][j]=sc.nextDouble();
        }
        }
       TwoD d=new TwoD();
       d.Totaldistance(arr, names);
    }
}
