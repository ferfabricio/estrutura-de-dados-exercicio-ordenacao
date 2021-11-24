import java.util.Arrays;

public class BubbleSort {
    private final int[] unordered;

    public BubbleSort(int[] unordered)
    {
        this.unordered = unordered;
    }

    public int[] sort()
    {
        int[] ordered = unordered;
        for (int i = 0; i < ordered.length; i++) {
            for (int j = 0; (j < ordered.length - i - 1); j++) {
                if (ordered[j] > ordered[j + 1]) {
                    int old = ordered[j];
                    ordered[j] = ordered[j + 1];
                    ordered[j + 1] = old;
                }
            }
        }

        return ordered;
    }
}
