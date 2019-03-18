package learningRxJava;

/*
Cuando nosotros usamos Just, implicitamente ya estamos invocando al metodo OnNext y al metodo OnComplete
 */

import io.reactivex.Observable;

public class ObservableJust {

  public static void main(String[] args) {

    // Al hacer esto ya se invoco a OnNext y a OnComplete
    Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta",
            "Epsilon");

    // Procedemos a "operarlo" y a imprimirlo por pantalla
    source
            .map(String::length)
            .filter(x -> x >= 5)
            .subscribe( x -> System.out.println("Received: " + x));

  }

}
