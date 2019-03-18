package learningRxJava;

import io.reactivex.Observable;

public class LauncherErrorOperators {

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
    Observable<Integer> lenghts = source
            .map( x -> x.length());

    Observable<Integer> filters = lenghts
            .filter( x -> x >= 5);

    // Imprimimos los valores en la consola
    filters
            .subscribe(System.out::println, Throwable::printStackTrace);

  }

}
