package learningRxJava;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

/*
Con ConnectableObservable es una forma de convertir Cold Observables a Hot Observables.
En este ejemplo vamos a ve lo siguiente:

Notamos como un Observer esta recibiendo el String mientras el otro esta recibiendo la longitud
y el segundo esta pintandolos en un estilo intercalado. Ambas suscripciones estan siendo
configuradas de antemano, y el connect() es llamado para disparar las emisiones. En cambio que
Observer 1 procesando todas las emisiones antes Observer 2, cada emision va a cada Observer
simultaneamente. Observer 1 recibe Alpha y Observer 2 recibe 5 y entonces Beta y 4, y etc.
Usando ConnectableObservable forzamos cada emision a todos los observadores a la vez es conocido
como "MULTICASTING".
 */

public class ConnectableObservableTest {

  public static void main(String[] args) {

    ConnectableObservable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
            .publish();

    // Set up observer 1
    source
            .subscribe(x -> System.out.println("Observer 1: " + x));

    // Set up observer 2
    source
            .map(String::length)
            .subscribe( x -> System.out.println("Observer 2: " + x));

    // Fire !!!
    source.connect();

  }

}
