/* HOMEWORK PROBLEM */
package Lec3;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
  
        /* 
         * 1 -> jog
         * 2 -> biyog
         * 3 -> puran
         * 4 -> haran(/)
         * 5 -> haran(%)
         */
  
      switch(operator)  {
          case 1: System.out.println(a+b);
          break;
          case 2: System.out.println(a-b);
          break;
          case 3: System.out.println(a*b);
          break;
          case 4: if(b==0) {
              System.out.println("Invalid Division");
          }
           else 
           {
             System.out.println(a/b);
           }
           break;
          case 5: if(b==0) {
              System.out.println("Invalid Division");
          }
           else 
           {
             System.out.println(a%b);
           }
           break;
          default : System.out.println("Invalid operator");
          }
      }
}
