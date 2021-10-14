package com.ibm.aac.gerardo.sorting;

public class SelectionSort implements Sorteable {
  
  public String[] sort(String[] names) {
    String[] namesCopy = names;
    
    for (int i = 0; i < namesCopy.length - 1; i++) {
      int minimumIdx = i;
      
      for (int j = i + 1; j < namesCopy.length; j++) {
        int value = namesCopy[j].compareTo(namesCopy[minimumIdx]);
        if (value < 0) {
          minimumIdx = j;
        }
      }

      if (minimumIdx != i) {
        String aux = namesCopy[minimumIdx];
        namesCopy[minimumIdx] = namesCopy[i];
        namesCopy[i] = aux;
      }
    }
    
    return namesCopy;
  }
}
