package com.ibm.aac.gerardo.sorting;

public class InsertionSort implements Sorteable {

  @Override
  public String[] sort(String[] names) {

    for (int i = 0; i < names.length - 2; i++) {
      for (int j = i + 1; j < names.length; j++) {
        if (names[j].compareTo(names[i]) < 0) {
          String aux = names[j];
          names[j] = names[i];
          names[i] = aux;
        }
      }
    }

    return names;
  }
  
}
