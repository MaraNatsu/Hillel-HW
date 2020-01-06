package secondHW;

public class ArrayEvenOdd {

    public static void main(String args[]) {

        int[] array = {16, 45, 2, 21, 11, 18, 1, 71, 8, 94};

        System.out.println("Even numbers:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");
            }
        }

        System.out.println();

        System.out.println("Odd numbers:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
