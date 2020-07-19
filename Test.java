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
public class Test {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
//            int[] a = { 2, 6, 1, 5, 10, 7 };
            Arrays.sort(a);
                    int max=a[a.length - 1] - a[0];
                                System.out.print(max);

                    
        }
    
}
