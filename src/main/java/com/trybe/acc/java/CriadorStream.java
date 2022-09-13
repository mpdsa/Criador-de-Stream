package com.trybe.acc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/** Classe CriadorStream. */
public class CriadorStream {
  
  /**
   * Método criarDoItem.
   * Fonte https://www.oracle.com/br/technical-resources/articles/java-stream-api.html.
   */
  public <T> Stream<T> criarDoItem(T item) {
    List<T> items = new ArrayList<T>();
    items.add(item);
    
    return items.stream();
  }
  
  
  /**
   * Fonte https://mkyong.com/java8/java-how-to-convert-array-to-stream/
   */
  public <T> Stream<T> criarDoArray(T[] array) {
    return Arrays.stream(array);
    
  }
  
  public <T> Stream<T> criarDaLista(List<T> lista) {
    return lista.stream();
    
  }
}
