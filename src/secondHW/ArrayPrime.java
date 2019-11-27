package secondHW;

public class ArrayPrime {
    public static void main(String[] args) {

        int[] array = {5, 19, 16, 45, 2, 17, 21, 4, 11, 18, 1, 71, 8, 94, 109};

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0 && array[i] != 2) continue;
            if (array[i] % 3 == 0 && array[i] != 3) continue;
            if (array[i] % 5 == 0 && array[i] != 5) continue;
            if (array[i] % 7 == 0 && array[i] != 7) continue;

            System.out.print(array[i] + " ");
        }
    }
}
