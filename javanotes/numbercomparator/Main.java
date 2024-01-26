package javanotes.numbercomparator;

import javanotes.numbercomparator.utils.NumberComparator;

public class Main {

    public static void main(String[] args) {
        printNumbers(14, 15, 4);

    }

    private static void printNumbers(int a, int b, int c) {

        if (NumberComparator.compare(a, b) == -1) {
            if (NumberComparator.compare(b, c) == -1) {
                System.out.println(a + "<" + b + "<" + c);
            } else if (NumberComparator.compare(b, c) == 0) {
                System.out.println(a + "<" + b + "=" + c);
            } else {
                if (NumberComparator.compare(a, c) == 1) {
                    System.out.println(b + "<" + c + "<" + a);
                } else if (NumberComparator.compare(a, c) == -1) {
                    System.out.println(b + "<" + a + "<" + c);
                } else {
                    System.out.println(b + "<" + c + "=" + a);
                }
            }
        }
    }
}