package br.com.treinaweb.parte2;

public class Excecao3 {

  public static void main(String[] args) {
    int a = 0;
    try{
      a = obterDivisao(6,0);
    }catch(ArithmeticException e){
      System.out.println("Divisão por zero");
    }
    System.out.println("a: " + a);

  }

  static int obterDivisao(int v1,int v2)
  throws ArithmeticException{
    int r=0;
    r= v1/v2;
    return r;
  }

}