import java.util.*;


public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s=new String(ch1);
        String s1=new String(ch2);
        if(s.equals(s1)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}