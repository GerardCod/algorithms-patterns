package com.ibm.aac.gerardo.searching;

public class BinarySearchRecursive implements Searchable<String> {

  @Override
  public boolean search(String[] data, String target) {
    return searchHelper(data, target, 0, data.length - 1);
  }
  
  private boolean searchHelper(String[] data, String target, int min, int max) {
    if (min > max) {
      return false;
    }

    int middle = (min + max) / 2;

    if (target.compareTo(data[middle]) < 0) {
      return searchHelper(data, target, min, middle - 1);
    }

    if (target.compareTo(data[middle]) > 0) {
      return searchHelper(data, target, middle + 1, max);
    }

    return true;
  }
}
