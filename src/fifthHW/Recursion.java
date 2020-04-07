package fifthHW;

public class Recursion {

    static int n;

    static void recursiveFunction(int value) {
        n++;
        if (n <= value) {
            System.out.print(n + " ");
            recursiveFunction(value);
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
        int val = 6;
        recursiveFunction(val);
        System.out.println();
        System.out.println("The sum of numbers in " + val + " is: " + sum(val));
    }
}
