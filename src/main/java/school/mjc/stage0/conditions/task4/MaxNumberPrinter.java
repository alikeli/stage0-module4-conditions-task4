package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (third >= second && third >= first) {
            System.out.println(third);
        } else if (second >= first && second >= third) {
            System.out.println(second);
        } else if (first >= second && first >= third) {
            System.out.println(first);
        }
    }
}
