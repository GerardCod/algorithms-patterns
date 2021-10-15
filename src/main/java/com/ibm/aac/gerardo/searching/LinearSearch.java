package com.ibm.aac.gerardo.searching;

public class LinearSearch implements Searchable<String> {

  @Override
  public boolean search(String[] data, String target) {
    boolean found = false;
    int i = 0;

    while (!found && i < data.length) {
      if (data[i].equals(target)) {
        found = true;
      }

      i++;
    }

    return found;
  }
  
}
