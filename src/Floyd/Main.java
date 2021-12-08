package Floyd;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    static void printFloyd(int n)
     {
        int i, j, val = 1, s = 1, a=0,b = 0;
               for (i = 1; i <= n; i++)
               {
                   for (j = 1; j <= i; j++) {
                       System.out.print(val + " ");
                       val++;

                   }

                   System.out.println();
                      }
           }

         public static void main(String[] args) throws IOException {

                 System.out.println(" Give us a positive int, please!");
                 Scanner in = new Scanner(System.in);
                 int n = in.nextInt();

                 printFloyd(n);
                      }
}
