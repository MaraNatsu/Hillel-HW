package fifthHW;

public class Recursion {

    static int n;

    static void recursiveFunction() {
        n++;
        if (n <= 18) {
            System.out.print(n + " ");
            recursiveFunction();
            n++;
        }
    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return (n + sum(n - 1));
    }

    public static void main(String[] args) {
        recursiveFunction();
        System.out.println();
        System.out.println("The sum of numbers in 18 is: " + sum(18));
    }
}
