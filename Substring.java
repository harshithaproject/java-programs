import java.util.*;
public class Substring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String temp="";
        String temp1="";
        int count=0;
        temp=temp+name.substring(3,12);
        System.out.print(temp);
        for(int i=0;i<temp.length();i++){
            if((temp.startsWith("HA") || temp.startsWith("ha"))&& (temp.endsWith("HA")|| (temp.endsWith("ha")))){
                temp1=name.substring(1, name.length()-2);
               int  size=temp1.length();
                if(size%2==0){
                count++;
                }
            }
  
        }
        if(count>0){
            System.out.println(temp);
        }else{
            System.out.println("InValid");
        }
}
            
    }

