package ninthHW.exceptions;

public class IncorrectStemLengthException extends Exception {

    public IncorrectStemLengthException(double minStemLength, double maxStemLength) {
        super("The range of stem length from " + minStemLength +
                " m to " + maxStemLength + " m is incorrect. Stem length value can not be a negative number." + '\n');
    }
}
