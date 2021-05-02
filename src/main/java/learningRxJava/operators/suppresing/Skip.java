package learningRxJava.operators.suppresing;

import io.reactivex.Observable;


/*
El operador Skip() es el opuesto de el operador Take(). Este ignorara el numero especificado
de emisiones y entonces emite los primeros que prosiguen. Si yo queria Skip las primeras
90 emisiones de un Observable(), yo podria usar este operador, como muestro en el pequeno
fragmento de codigo.
 */
public class Skip {

  public static void main(String[] args) {

    Observable.range(1, 100)
        .skip(90)
        .subscribe(x -> System.out.println("Received: " + x));

  }

}
