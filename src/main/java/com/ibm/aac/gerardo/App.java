package com.ibm.aac.gerardo;

import com.ibm.aac.gerardo.sorting.BubbleSort;
import com.ibm.aac.gerardo.sorting.InsertionSort;
import com.ibm.aac.gerardo.sorting.SelectionSort;
import com.ibm.aac.gerardo.sorting.Sorteable;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String[] names = new String[] { 
            "Garcia Arreguin Montserrat Carolina ",
            "Cortes Lagunes Ruth Silvana", 
            "Flores Silva	Karla Paulette	Villa de Alvarez ", 
            "Delgado Barron Luis Felipe Gonzales",
            "Chavez Heredia Andrea",
            "Espejo Ramos Hansel Andres", 
            "Garcia Orozco Lisset Vianey", 
            "Aguayo Gonzalez Jaime Francisco", 
            "Flores Aguilar Aniyensy Sarai",
            "De jesus Ramos Ariana", 
        };

        String[] namesCopy = new String[] { 
            "Garcia Arreguin Montserrat Carolina ",
            "Cortes Lagunes Ruth Silvana", 
            "Flores Silva	Karla Paulette	Villa de Alvarez ", 
            "Delgado Barron Luis Felipe Gonzales",
            "Chavez Heredia Andrea",
            "Espejo Ramos Hansel Andres", 
            "Garcia Orozco Lisset Vianey", 
            "Aguayo Gonzalez Jaime Francisco", 
            "Flores Aguilar Aniyensy Sarai",
            "De jesus Ramos Ariana", 
        };

        Sorteable algorithm = new SelectionSort();
        String[] namesSorted = algorithm.sort(names);
            
        algorithm = new InsertionSort();
        algorithm.sort(namesCopy);

        algorithm = new BubbleSort();
        String[] sorted = algorithm.sort(names);

        for (String name: namesSorted) {
            System.out.println(name);
        }

        System.out.println("--------------------------------------------------------");
        
        for (String name: namesCopy) {
            System.out.println(name);
        }
        
        System.out.println("--------------------------------------------------------");
        
        for (String name: sorted) {
            System.out.println(name);
        }
    }
}
