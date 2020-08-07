public class QuickSort {
  public void quickSort(int[] arr, int firstIdx, int lastIdx) {
    if (firstIdx < lastIdx) {
      int pi = partition(arr, firstIdx, lastIdx);

      quickSort(arr, firstIdx, pi - 1);
      quickSort(arr, pi + 1, lastIdx);
    }
  }

  private int partition(int[] arr, int firstIdx, int lastIdx) {
    int pi = arr[lastIdx];

    int piIdx = firstIdx - 1;
    int tmp;
    for (int i = firstIdx; i < lastIdx; i++) {
      if (arr[i] < pi) {
        piIdx++;
        tmp = arr[piIdx];
        arr[piIdx] = arr[i];
        arr[i] = tmp;
      }
    }
    tmp = arr[piIdx + 1];
    arr[piIdx + 1] = arr[lastIdx];
    arr[lastIdx] = tmp;

    return piIdx + 1;
  }

}
