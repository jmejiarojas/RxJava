package learningRxJava;

import io.reactivex.Observable;

/*
Incluso si el segundo Observer transforma estas emisiones con operadores, seguira tendiendo
su propio stream de emisiones. Usando operadores tales como map() o filter() contra un
Cold Observable todavia mantendra la naturaleza "COLD" de los Observables cedidos.
 */

public class ColdObservablesWithOperators {

  public static void main(String[] args) {

    Observable<String> source =
            Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");

    // first observer
    source
            .subscribe( x -> System.out.println("Observer 1 Received: " + x));

    // second observer
    source
            .map(String::length)
            .filter( x -> x >= 5)
            .subscribe( x -> System.out.println("Observer 2 Received: " + x));


  }

}
