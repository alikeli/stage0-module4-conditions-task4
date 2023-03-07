package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
      //  int i = first < second ? second : first;
        String i = "first";
        String ii = "second";
        System.out.println(first <= second ? ii : i);
    }

    public static void main(String[] args) {
        TernaryPrinter t = new TernaryPrinter();
        t.printWhichIsBigger(1,10);
    }
}
