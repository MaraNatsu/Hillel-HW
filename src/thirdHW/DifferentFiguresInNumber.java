package thirdHW;

public class DifferentFiguresInNumber {
    public static void main(String[] args) {
        int[] numbers = {14211, 16481, 811, 6, 214, 16, 184602, 114061, 42};
        System.out.println("Numbers which include different figures only are: ");
        for (int i = 0; i < numbers.length; i++) {
            boolean numberIsMatch = compareFigures(numbers[i]);
            if (!numberIsMatch) {
                System.out.print(numbers[i] + "  ");
            }
        }
    }

    private static boolean compareFigures(int number) {
        int[] figures = new int[0];
        while (number != 0) {
            int figure = number % 10;
            number = number / 10;

            int[] newArray1 = new int[figures.length + 1];
            copy(newArray1, figures);
            newArray1[newArray1.length - 1] = figure;
            figures = newArray1;
        }

        for (int i = 0; i < figures.length - 1; i++) {
            for (int j = 1 + i; j < figures.length - i; j++) {
                if (figures[i] == figures[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void copy(int[] to, int[] from) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }
}
