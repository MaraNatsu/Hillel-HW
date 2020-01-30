package thirdHW;

public class Sequences {
    public static void main(String args[]) {
        int[] sequence = {-5, 2, 8, -1, 6, 1, 4, -17, -18, 4, 0};
        int[] subSequence = {-1, 6, 1, 4, -17, -18};
        int figureMatches = 0;
        boolean isMatch = false;

        for (int i = 0; i < sequence.length; i++) {
            figureMatches = 0;
            for (int j = 0; j < subSequence.length; j++) {
                isMatch = false;
                if (sequence.length == i + j) {
                    break;
                }

                if (sequence[i + j] == subSequence[j]) {
                    figureMatches++;
                }

                if (figureMatches == subSequence.length) {
                    isMatch = true;
                    break;
                }
            }

            if (isMatch) {
                break;
            }
        }

        if (subSequence.length == figureMatches) {
            System.out.println("Number sequence is subsequence");
        } else {
            System.out.println("Number sequence is not subsequence");
        }
    }
}
