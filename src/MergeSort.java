public class MergeSort {
  public int[] mergeSort(int[] arr, int firstIdx, int lastIdx) {
    if (firstIdx == lastIdx) {
      return new int[] {arr[firstIdx]};
    }
    int middleIdx = (firstIdx + lastIdx) / 2;

    return sort(mergeSort(arr, firstIdx, middleIdx), mergeSort(arr, middleIdx + 1, lastIdx));
  }

  private int[] sort(int[] firstArr, int[] secondArr) {
    int[] returnArr = new int[firstArr.length + secondArr.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i != firstArr.length || j != secondArr.length) {
      if (i >= firstArr.length) {
        returnArr[k] = secondArr[j];
        j++;
      } else if (j >= secondArr.length) {
        returnArr[k] = firstArr[i];
        i++;
      } else if (firstArr[i] <= secondArr[j]) {
        returnArr[k] = firstArr[i];
        i++;
      } else {
        returnArr[k] = secondArr[j];
        j++;
      }
      k++;
    }

    return returnArr;
  }

}
