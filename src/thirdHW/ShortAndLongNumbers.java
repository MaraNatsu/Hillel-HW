package thirdHW;

public class ShortAndLongNumbers {
    public static void main(String[] args) {

        int[] numbers = {14211, 16481, 6, 214, 21648224, 16, 184602, 114061, 42, 1};
        int[] figures = countFiguresArr(numbers);
        sortFiguresAndNumbers(figures, numbers);

        int[] longestNumber = new int[0], shortestNumber = new int[0];
        int maxFigureNumber = figures[figures.length - 1], minFigureNumber = figures[0];
        for (int i = 0; i < numbers.length; i++) {

            if (figures[i] == minFigureNumber) {
                int[] newArray1 = new int[shortestNumber.length + 1];
                copy(newArray1, shortestNumber);
                newArray1[newArray1.length - 1] = numbers[i];
                shortestNumber = newArray1;
            }

            if (figures[i] == maxFigureNumber) {
                int[] newArray2 = new int[longestNumber.length + 1];
                copy(newArray2, longestNumber);
                newArray2[newArray2.length - 1] = numbers[i];
                longestNumber = newArray2;
            }

            if (figures[i] >= maxFigureNumber) {
                maxFigureNumber = figures[i];
            }

            if (figures[i] <= minFigureNumber) {
                minFigureNumber = figures[i];
            }
        }

        System.out.println("Minimal numbers are: ");

        for (int i = 0; i < shortestNumber.length; i++) {
            System.out.print(shortestNumber[i] + " ");
        }

        System.out.println();
        System.out.println("Number of figures is: " + minFigureNumber);
        System.out.println();
        System.out.println("Maximal numbers are: ");

        for (int i = 0; i < longestNumber.length; i++) {
            System.out.print(longestNumber[i] + " ");
        }

        System.out.println();
        System.out.println("Number of figures is: " + maxFigureNumber);
    }

    private static int countFigures(int number) {
        int figures = 0;
        while (number != 0) {
            number = number / 10;
            figures++;
        }
        return figures;
    }

    private static int[] countFiguresArr(int[] numbers) {
        int[] figuresArr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            figuresArr[i] = countFigures(numbers[i]);
        }
        return figuresArr;
    }

    private static void sortFiguresAndNumbers(int[] figures, int[] numbers) {
        int tempFigures = 0;
        int tempNumbers = 0;
        for (int i = 0; i < figures.length - 1; i++) {
            for (int j = 0; j < (figures.length - i - 1); j++) {
                if (figures[j] > figures[j + 1]) {
                    tempFigures = figures[j];
                    tempNumbers = numbers[j];

                    figures[j] = figures[j + 1];
                    numbers[j] = numbers[j + 1];

                    figures[j + 1] = tempFigures;
                    numbers[j + 1] = tempNumbers;
                }
            }
        }
    }

    private static void copy(int[] to, int[] from) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }
}