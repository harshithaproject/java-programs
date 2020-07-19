import java.util.*;
public class Delete {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int delelement=arr[i]%2;
            if(delelement==0){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
               break;
            }
        }
                for(int i=0;i<arr.length-1;i++){
                    System.out.println(arr[i]);
                }
    }
}
