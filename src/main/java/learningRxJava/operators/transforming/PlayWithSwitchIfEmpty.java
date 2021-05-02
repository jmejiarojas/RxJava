package learningRxJava.operators.transforming;

import io.reactivex.Observable;

/*
Similar a defaultIfEmpty(), switchIfEmpty() especifica un diferente Observable desde el cual emitir valores si el
Observable origen esta vacio.

Podriamos elegir emitir 3 cadenas adicionales, por ejemplo, si el Obervable anterior salio vacio debido de una
operacion filter().
 */
public class PlayWithSwitchIfEmpty {

  public static void main(String[] args) {

    Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
        .filter(s -> s.startsWith("Z"))
        .switchIfEmpty(Observable.just("Zeta", "Eta", "Theta"))
        .subscribe(i -> System.out.println("RECEIVED: " + i),
            e -> System.out.println("RECEIVED ERROR: " + e)
        );

  }

}
