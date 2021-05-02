package learningRxJava.operators.transforming;

import io.reactivex.Observable;

/*
Si nosotros queremos recurrir a una unica emision si un Observable dado sale vacio, podemos usar defaultEmpty().
Nosotros podemos usar una emision T por defecto si no se producen emisiones cuando se llama a onComplete().
 */
public class PlayDefaultIfEmpty {

  public static void main(String[] args) {

    Observable<String> items = Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");

    items.filter(s -> s.startsWith("Z"))
        .defaultIfEmpty("None")
        .subscribe(System.out::println);

  }

}
