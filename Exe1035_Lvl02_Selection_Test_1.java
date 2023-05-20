/* Exe 1035 - Level 02 - Selection Test 1;

Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater
than A and if the sum of C and D is greater than the sum of A and B and if C and
D were positives values and if A is even, write the message “Valores aceitos”
(Accepted values). Otherwise, write the message “Valores nao aceitos”
(Values not accepted).

Input
Four integer numbers A, B, C and D.

Output
Show the corresponding message after the validation of the values​​.

*/
public class Exe1035_Lvl02_Selection_Test_1 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        if ( ((B > C) && (D > A)) && (Long.sum(C, D) > Long.sum(A, B)) && (isPositive(C) && isPositive(D) && isEven(A)) ) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
    public static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
