import java.util.*;
import java.math.*;
public class Difference {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int dif=0;
        int i=0;
        int j=0;
        int diff[]=new int[256];
        int max=diff[0];
        int arr[]=new int[size];
        for( int l=0;l<size;l++){
            arr[l]=sc.nextInt();
        }
        
        for(i=0;i<=size;i++){
        for(j=i+1;j<size;j++){
          dif=Math.abs(arr[i]-arr[j]);
          diff[i]=dif;
//          System.out.println(Math.abs(arr[j])+"-"+Math.abs(arr[i])+"="+Math.abs(dif));
//          System.out.print(dif);
           }
        }
                                    for( int k=0;k<=size;k++){
                        if(diff[k]>max){
                            max=diff[k];
                }
                }
                    System.out.println(max);        
                                                if(max==dif){
                                                    System.out.print(i+" "+j);
                                                }
}
}

