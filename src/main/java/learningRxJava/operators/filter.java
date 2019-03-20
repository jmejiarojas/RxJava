package learningRxJava.operators;

import io.reactivex.Observable;

/*
The filter operator acepta Predicate<T> para obtener un Observable<T>. Esto significa
que tu provees una lambda que cualifique o evalue cada emision para mapear a un valor
boleano, y emisiones con valor false no avanzaran.

En el siguiente ejemplo, tu puedes usar filter() para solo permitir emisiones que tengan
5 caracteres de longitud.
 */

public class filter {

  public static void main(String[] args) {

    Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
            .filter(x -> x.length() != 5)
            .subscribe(x -> System.out.println("Received: " + x));

  }

}
