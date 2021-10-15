package com.ibm.aac.gerardo.searching;

public class BinarySearchIterative implements Searchable<String> {

  @Override
  public boolean search(String[] data, String target) {
    boolean found = false;
    int min = 0;
    int max = data.length - 1;

    while (!found && min <= max) {
      int middle = (min + max) / 2;

      if (target.compareTo(data[middle]) < 0) {
        max = middle - 1;
      } else if (target.compareTo(data[middle]) > 0) {
        min = middle + 1;
      } else {
        found = true;
      }

    }


    return found;
  }
  
}
