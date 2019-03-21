package learningRxJava.operators;

import io.reactivex.Observable;

/*
Otra variante del operador take() es el operador takeWhile(), cual toma emisiones
mientras una condicion derivada desde cada emision es true. El siguiente ejemplo
sera seguir tomando emisiones que son menores que 5. El momento este encuentra uno
que no es, este llamara a onComplete() method y "dispose" de este.
 */

public class TakeWhile {

    public static void main(String[] args) {

        Observable.range(1, 100)
                .takeWhile(x -> x < 5)
                .subscribe(x -> System.out.println("Received: " + x));

    }

}
