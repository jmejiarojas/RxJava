package learningRxJava.operators;

import io.reactivex.Observable;

/*
Tu tambien puedes agregar un argumento lambda que "mapee" cada emision para una llave usada
para la logica de equidad. Esto permite las emisiones, pero no la llave, para avanzar mientras
usamos la llave para distinta logica. Por ejemplo, nosotros podemos poner como llave la longitud
de cada String y usarlo como unicidad, pero emitira las cadenas en lugar de sus longitudes.
 */

public class DistinctLambda {

    public static void main(String[] args) {

        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .distinct(x -> x.length()) // String::lenght
                .subscribe(x -> System.out.println("Received: " + x));

    }

}
