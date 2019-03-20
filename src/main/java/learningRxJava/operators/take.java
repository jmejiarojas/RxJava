package learningRxJava.operators;

import io.reactivex.Observable;

/*
El operador take() tiene dos sobrecargas. Uno tomara un numero especifico de emisiones
y entonces llamara onComplete() despues de capturar a todos ellos. Este tambien "dispose"
de toda la transmision para que no se produzcan mas emisiones. Por ejemplo, take(3)
emitira el primer 3 emisiones y luego invocara a onComplete().
 */

public class take {

  public static void main(String[] args) {

    Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
            .take(3)
            .subscribe( s -> System.out.println("Received: " + s));

  }

}
