import java.util.*;

public class Combination {
         public static long fact(int num) {
                  if (num == 1 || num == 0) {
                           return 1;
                  } else {
                           long res = 1;
                           for (int i = 1; i <= num; i++) {
                                    res = res * i;
                           }
                           return res;
                  }
         }

         public static long calCombination(int n, int r) {
                  if (n == r || r == 0) {
                           return 1;
                  } else {
                           return (fact(n) / (fact(r) * fact(n - r)));
                  }
         }

         public static void main(String[] args) {
                  int n, r;
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the value of n: ");
                  n = sc.nextInt();
                  System.out.println("Enter the value of r: ");
                  r = sc.nextInt();

                  long result = calCombination(n, r);
                  System.out.println("Result: " + result);
         }
}