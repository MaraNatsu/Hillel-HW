package thirdHW;

public class Matrix {
    public static void main(String[] args) {
        int startingNumber = 1;
        int endingNumber = 64;
        int iterableNumber = 1;

        while (startingNumber * startingNumber < endingNumber) {
            startingNumber++;
        }

        for (int i = 0; i < startingNumber; i++) {
            for (int j = 0; j < startingNumber; j++) {
                if (iterableNumber <= endingNumber) {
                    System.out.print(iterableNumber++ + "  ");
                }
            }
            System.out.println();
        }
    }
}
