package learningRxJava.observables;

import io.reactivex.Observable;

public class LauncherErrorOperatorImproved {

  public static void main(String[] args) {

    Observable<String> source = Observable.create(emitter -> {

      try {
        emitter.onNext("Alpha");
        emitter.onNext("Beta");
        emitter.onNext("Gamma");
        emitter.onNext("Delta");
        emitter.onNext("Epsilon");
        emitter.onComplete();
      } catch (Throwable e) {
        emitter.onError(e);
      }
    });

    // Se quiere que se almacene en un Observable de Integers con las longitudes de las cadenas
    // Luego se va a filtrar los que la longitud sea mayor o igual a 5
    // Por ultimo imprimimos los valores
    source
            .map( x -> x.length())
            .filter( x -> x >= 5)
            .subscribe(System.out::println, Throwable::printStackTrace);


  }

}
