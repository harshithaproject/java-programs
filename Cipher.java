import java.util.*;
public class Cipher {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String finalstr="";
        char ch;
        int a;
        String sentence=sc.nextLine();
        for(int i=0;i<sentence.length();i++){
            ch=sentence.charAt(i);
            if(Character.isLetter(ch)){
                a=ch-7;
                if((Character.isUpperCase(ch)&&a>90)||(Character.isLowerCase(ch)&&a>122)){
                    
                a=a+26;
            }
                ch=(char)a;
            }
            finalstr=finalstr+ch;
        }
        System.out.print(finalstr);
    }
}
