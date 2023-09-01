/* Q)Print all even no. till n. */

package Lec4;

public class Evennumber {
    public static void main(String[] args) {
        int n = 98;

        for (int i=1; i<=n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
