package learningRxJava.observables;

import io.reactivex.Observable;

/*
El metodo subscribe() es sobrecargado, es decir que podemos pasarle 3 parametros lambdas separados
por comas, la lambda onNext que es un Consumer, la lambda onError que es un Consumer, y la lambda
onComplete que es un Action.
 */
public class ShorthandObserver {

  public static void main(String[] args) {
    Observable<String> source =
            Observable.just("Alpha", "Beta", "Gamma", "Delta",
                    "Epsilon");

    source
            .map(String::length)
            .filter(x -> x >= 5)
            .subscribe(
                    x -> System.out.println("Received: " + x),
                    Throwable::printStackTrace,
                    () -> System.out.println("Done!"));
  }

}
