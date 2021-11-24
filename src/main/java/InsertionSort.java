import java.util.Arrays;

public class InsertionSort {
    private final int[] unordered;

    public InsertionSort(int[] unordered) {
        this.unordered = unordered;
    }

    public int[] sort() {
        int[] ordered = unordered;
        for (int i = 1; i < ordered.length; i++) {
            int toCompare = ordered[i];
            int j = i - 1;
            while (j >= 0 && ordered[j] > toCompare) {
                ordered[j+1] = ordered[j];
                j = j - 1;
            }
            ordered[j+1] = toCompare;
        }

        return ordered;
    }
}
