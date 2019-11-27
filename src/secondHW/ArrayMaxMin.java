package secondHW;

public class ArrayMaxMin {
    public static void main(String[] args) {

        int[] array = {16, 45, 2, 21, 11, 18, 1, 71, 8, 94};
        int max = array[0], min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= max) {
                max = array[i];
            }

            if (array[i] <= min) {
                min = array[i];
            }
        }

        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}
