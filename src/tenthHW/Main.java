package tenthHW;

import java.util.Scanner;

public class Main {
  private static volatile int[] numbers = new int[0];

  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    try {

      System.out.println("Enter number for:");
      int numberFor = scan.nextInt();

      System.out.println("Enter number to:");
      int numberTo = scan.nextInt();
      if (numberFor >= numberTo) {
        return;
      }

      System.out.println("Enter number threads:");
      int countThreads = scan.nextInt();
      if (countThreads < 1) {
        return;
      }

      int countNumbers = numberTo - numberFor;
      for (int i = 0; i < countThreads; i++) {
        AppThread thread = new AppThread(numberFor + (i * countNumbers), numberTo);
        thread.setDaemon(true);
        thread.start();
        thread.join();
      }

      System.out.println("[");
      for (int i = 0; i < numbers.length; i++) {
        System.out.println(" " + numbers[i] + " ");
      }
      System.out.println("]");
    } catch (InterruptedException err) {
      System.out.println("InterruptedException error");
    }
  }

  public static synchronized void addToNumber(int number) {
    int[] newArr = new int[numbers.length + 1];
    copyArray(newArr, numbers);
    newArr[newArr.length - 1] = number;
    numbers = newArr;
  }

  public static void copyArray(int[] to, int[] from) {
    for (int i = 0; i < from.length; i++) {
      to[i] = from[i];
    }
  }
}