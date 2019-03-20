package learningRxJava.observables;

import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;


/*
Vamos a implementar los 3 parametros que recibe un subscribe() pero verbosamente.
 */

public class ShortHandObserverVerbose {

  public static void main(String[] args) {

    Observable<String> source =
            Observable.just("Alpha", "Beta", "Gamma", "Delta",
                    "Epsilon");

    // Como sabemos el metodo subsribe puede recibir 3 parametros lambdas.
    Consumer<Integer> onNext = x -> System.out.println("Received: " + x);
    Consumer<Throwable> onError = Throwable::printStackTrace;
    Action onComplete = () -> System.out.println("Done !!!");

    source
            .map(String::length)
            .filter(x -> x >= 5)
            .subscribe(onNext, onError, onComplete);

  }

}
