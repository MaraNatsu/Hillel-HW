package tenthHW;

import java.lang.Thread;

public class AppThread extends Thread {
  public int numberFor;
  public int numberTo;

  public AppThread(int numberFor, int numberTo) {
    super();
    this.numberFor = numberFor;
    this.numberTo = numberTo;
  }

  @Override
  public void run() {
    for (int i = numberFor; i < numberTo; i++) {
      boolean isPrime = checkNatural(i);
      if (isPrime) {
        Main.addToNumber(i);
      }
    }
  }

  public boolean checkNatural(int number) {
    boolean isNatural = true;
    for (int i = 2; i < (number / 2); i++) {
      if (number % i == 0) {
        isNatural = false;
        break;
      }
    }
    return isNatural;
  }
}
