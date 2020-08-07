import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();

        int[] array = new int[] { 38, 27, 43, 3, 9, 82, 10};

        int[] sorted = mergeSort.mergeSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(sorted));

        QuickSort quickSort = new QuickSort();

        int[] array2 = new int[] { 38, 27, 43, 3, 9, 82, 10};

        quickSort.quickSort(array2, 0, array.length - 1);

        System.out.println(Arrays.toString(array2));
    }
}
