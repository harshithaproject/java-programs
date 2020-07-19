/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weather;

/**
 *
 * @author activ
 */
public class Productdetail {
    private String[] productName;
    private int[] productQuantity;
    private float[] productPrice;
    public String[] search(int qty){
        int c=0;
        for(int i=0;i<productQuantity.length;i++)
        {
            if(productQuantity[i]==qty){
                c++;
            }
        }
        String[] result= new String[c];
        for(int i=0,j=0;i<productQuantity.length;i++)
        {
            if(productQuantity[i]==qty)
            {
                result[j++]=productName[i]+":"+productPrice[i];
            }
        }
        return result;
    }
    public String[]search(float price){
        int c=0;
        for (int i=0;i<productPrice.length ;i++ )
        {
            if(productPrice[i]==price)
            c++;
        }
        String[] result =new String[c];
        for (int i=0,j=0;i<productPrice.length;i++ )
        {
            if(productPrice[i]==price)
            {
                result[j++]=productName[i]+":"+productQuantity[i];
            }
        }
        return result;
    }
    public String[] search(){
        int c=0;
        for(int i=0;i<productQuantity.length;i++)
        {
            if(productQuantity[i]<10)
            c++;
        }
        String[] result=new String[c];
        for(int i=0,j=0;i<productQuantity.length;i++)
        {
            if(productQuantity[i]<10)
            result[j++]=productName[i];
        }
        return result;
    }
    public Productdetail(String[] productName,int[] productQuantity,float[] productPrice){
        this.productName=productName;
        this.productQuantity=productQuantity;
        this.productPrice=productPrice;
    }
}
