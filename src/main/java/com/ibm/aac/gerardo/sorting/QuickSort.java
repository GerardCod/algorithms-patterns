package com.ibm.aac.gerardo.sorting;

public class QuickSort implements Sorteable {

  @Override
  public String[] sort(String[] names) {
    sortHelper(names, 0, names.length - 1);
    return names;
  }
  
  private void sortHelper(String[] names, int min, int max) {
    if (min < max) {
      int part = partition(names, min, max);
      sortHelper(names, 0, part - 1);
      sortHelper(names, part + 1, max);
    }
  }

  private int partition(String[] names, int min, int max) {
    String pivot = names[max];

    int i = (min - 1);
    for (int j = min; j <= max; j++) {
      if (names[j].compareTo(pivot) < 0) {
        i++;
        String aux = names[j];
        names[j] = names[i];
        names[i] = aux;
      }
    }

    String aux = names[i + 1];
    names[i + 1] = names[max];
    names[max] = aux;

    return (i + 1);
  }

}
