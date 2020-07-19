
import java.util.*;
public class Country {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int size = sc.nextInt();
        String country[] = new String[size];
        for (int i = 0; i < country.length; i++) {
            country[i] = sc.next();
        }
        sc.nextLine();
        int pop[] = new int[size];
        for (int i = 0; i < pop.length; i++) {
            pop[i] = sc1.nextInt();
        }
        
        int pop1[] = new int[size];
        for (int j = 0; j < pop.length; j++) {
            pop1 = Arrays.copyOf(pop, j+1);
        }

        Arrays.sort(pop1);
        for (int i = 0; i < pop.length; i++) {
            for (int j = 0; j < pop1.length; j++) {
                if (pop1[i] == pop[j]) {
                    System.out.println(country[j]);
                }
            }
        }
        for (int j = 0; j < pop1.length; j++) {
            System.out.println(pop1[j]);
        }

    }
}
