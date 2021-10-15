package com.ibm.aac.gerardo.sorting;

public class MergeSort implements Sorteable {

  @Override
  public String[] sort(String[] names) {
    return sortHelper(names, 0, names.length - 1);
  }
  
  private String[] sortHelper(String[] names, int left, int right) {
    if (left == right) {
      return new String[] { names[left] };
    }

    int middle = (left + right) / 2;
    String[] leftSubList = sortHelper(names, left, middle);
    String[] rightSubList = sortHelper(names, middle + 1, right);

    return join(leftSubList, rightSubList);
  }

  private String[] join(String[] left, String[] right) {
    String[] result = new String[left.length + right.length];

    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i].compareTo(right[j]) <= 0) {
        result[k] = left[i];
        i++;
      } else {
        result[k] = right[j];
        j++;
      }
      k++;
    }

    while (i < left.length) {
      result[k] = left[i];
      i++;
      k++;
    }

    while (j < right.length) {
      result[k] = right[j];
      j++;
      k++;
    }

    return result;
  }
}
