package ninthHW;

import ninthHW.views.ConsoleProcessor;

public class Runner {
    public static void main(String[] args) {
        ConsoleProcessor consoleProcessor = new ConsoleProcessor();

        System.out.println("          --- Welcome to \"Flowers\" ---" + '\n' + '\n' +
                "Enter the number of action which you want to do." + '\n');

        consoleProcessor.consoleProcessor();
    }
}
