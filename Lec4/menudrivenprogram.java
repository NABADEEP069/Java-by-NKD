package Lec4;

import java.util.Scanner;

public class menudrivenprogram {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            int marks = sc.nextInt();
            if (marks>=90 && marks<=100) {
                System.out.println("This is good");
            }
        else if (marks >= 60 && marks <= 89) {
            System.out.println("This is also good");
        }
        else if (marks >= 0 && marks <= 59) {
           System.out.println("Marks don't matter but our effort does");
        }
        else {
            System.out.println("Invalid");
        }

        System.out.println("Want to continue ? (yes (1) 0r no(0))");
        input = sc.nextInt();
    } while(input == 1);
}

}
   