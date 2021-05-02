package learningRxJava.operators.transforming;

import io.reactivex.Observable;

/*
El operador repeat() repetira la suscripcion upstream despues de onComplete() un numero especifico de veces.
 */
public class PlayWithRepeat {

  public static void main(String[] args) {
    Observable.just("Alpha", "Beta", "Gamma" ,"Delta", "Epsilon")
        .repeat(2)
        .subscribe(s -> System.out.println("Received: " + s));
  }

}
