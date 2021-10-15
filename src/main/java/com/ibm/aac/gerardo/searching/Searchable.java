package com.ibm.aac.gerardo.searching;

/**
 * Es una interfaz genérica para definir un método de búsqueda.
 * 
 * @author Gerardo Aguilar.
 * @version 1.0.0 15/10/2021.
 */
public interface Searchable<T> {

  /**
   * Busca un elemento de una lista de acuerdo al tipo de dato elegido.
   * 
   * @param data   lista de elementos del tipo de dato elegido.
   * @param target elemento a buscar dentro de la lista.
   * @return
   *         <ul>
   *         <li>false: si el elemento no se encuentra dentro de la lista</li>
   *         <li>true: si el elemento se encuentra dentro de la lista</li>
   *         </ul>
   */
  boolean search(T[] data, T target);
}
