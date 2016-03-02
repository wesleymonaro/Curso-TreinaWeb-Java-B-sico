package br.com.treinaweb.parte2;
import java.util.*;
public class Map2 {

  public static void main(String[] args) {
    HashMap mapa =  new HashMap();

    mapa.put("Curso 1","JSE");
    mapa.put("Curso 2","JME");
    mapa.put("Curso 3","J2EE");
    mapa.put("Curso 4","EJB");

    Iterator i = mapa.keySet().iterator();
    while(i.hasNext()){
      String chave = (String)i.next();
      String curso = (String)mapa.get(chave);
      System.out.println(chave + ":" + curso);
    }

    TreeMap treemap = new TreeMap(mapa);
    Iterator t = treemap.keySet().iterator();
    while(t.hasNext()){
      String chave = (String)t.next();
      String curso = (String)treemap.get(chave);
      System.out.println(chave + ":" + curso);
    }

  }
}