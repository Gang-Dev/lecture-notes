package javanotes.numbercomparator.utils;

public class NumberComparator {

    private NumberComparator() {

    }

    public static Integer compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

}
