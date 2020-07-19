/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weather;
import java.util.*;
/**
 *
 * @author activ
 */
public class Productmain {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int no=sc.nextInt();
        sc.nextLine();
        String[] p_names=new String[no];
        float[] p_price =new float[no];
        int[] p_qty=new int[no];
        float item_price;
        int item_qtty;
        System.out.println("Enter product names:");
        for (int i=0;i<no ;i++ )
            p_names[i]=sc.nextLine();
        System.out.println("Enter the price of each product:");
        for(int i=0;i<no;i++)
            p_price[i]=sc.nextFloat();
        System.out.println("Enter the quantity of each product:");
        for(int i=0;i<no;i++)
            p_qty[i]=sc.nextInt();
        Productdetail s=new Productdetail(p_names,p_qty,p_price);
        System.out.println("Enter the product price to be searched:");
        item_price=sc.nextFloat();
        System.out.println("Enter the product quantity to be searched:");
        item_qtty=sc.nextInt();
        System.out.println("Search based on price");
        String[] price_arr=s.search(item_price);
        for(int i=0;i<price_arr.length;i++){
            System.out.println(price_arr[i]);
        }
        System.out.println("Search based on quantity");
        String[] qtty_arr=s.search(item_qtty);
        for(int i=0;i<qtty_arr.length;i++){
            System.out.println(qtty_arr[i]);
        }
        System.out.println("Products below re-ordered level");
        String[] p_arr=s.search();
        for(int i=0;i<p_arr.length;i++)
        {
            System.out.println(p_arr[i]);
        }
    }
}

