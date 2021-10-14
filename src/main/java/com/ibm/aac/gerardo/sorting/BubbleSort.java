package com.ibm.aac.gerardo.sorting;

public class BubbleSort implements Sorteable {

  @Override
  public String[] sort(String[] names) {
    String[] copyNames = names;

    for (int i = 0; i < copyNames.length - 1; i++) {
      
      for (int j = 0; j < copyNames.length - 1; j++) {
        
        if (copyNames[j].compareTo(copyNames[j + 1]) < 0) {
          String aux = copyNames[j + 1];
          copyNames[j] = copyNames[j + 1];
          copyNames[j + 1] = aux;
        }
      }
    }
    
    return null;
  }
  
}
