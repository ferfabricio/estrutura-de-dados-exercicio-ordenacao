import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {
    @org.junit.jupiter.api.Test
    void testeComArrayJaOrdenado() {
        InsertionSort sorter = new InsertionSort(new int[]{1, 2, 3, 4});
        int[] result = sorter.sort();
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @org.junit.jupiter.api.Test
    void testeComUmNumeroForaDeOrdem() {
        InsertionSort sorter = new InsertionSort(new int[]{2, 1, 3, 4});
        int[] result = sorter.sort();
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @org.junit.jupiter.api.Test
    void testeComTodosNumerosIguais() {
        InsertionSort sorter = new InsertionSort(new int[]{1, 1, 1, 1});
        int[] result = sorter.sort();
        assertArrayEquals(new int[]{1, 1, 1, 1}, result);
    }

    @org.junit.jupiter.api.Test
    void testeComDoisNumerosIguais() {
        InsertionSort sorter = new InsertionSort(new int[]{1, 2, 1, 2});
        int[] result = sorter.sort();
        assertArrayEquals(new int[]{1, 1, 2, 2}, result);
    }

    @org.junit.jupiter.api.Test
    void testComVetorRequerido() {
        InsertionSort sorter = new InsertionSort(new int[]{3, 6, 8, 1, 4, 9, 0});
        int[] result = sorter.sort();
        assertArrayEquals(new int[]{0, 1, 3, 4, 6, 8, 9}, result);
    }
}
