package Lec4;

import java.util.Scanner;

public class primeno {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

   boolean isPrime = true;
   for(int i=2; i<=n/2; i++) {
    if (n % i == 0) {
        isPrime = false;
        break;
    }
   } 

   if (isPrime) {
    if (n == 1) {
        System.out.println("this is neither prime not composite");
    }
    else {
        System.out.println("this is a prime no.");
    }
} else {
        System.out.println("this is not a prime number");
     }
   }  
}

