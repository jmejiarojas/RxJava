package learningRxJava.operators;

import io.reactivex.Observable;

/*
El operador distinct() emitira cada emision unica, pero suprimira cualquier duplicado
que siga. La equidad esta basada en la implementacion de los metodos hashcode() y equals()
de los objetos emitidos. Si nosotros queremos emitir distintas longitudes para una
secuencia de cadenas, como el siguiente ejemplo:
 */

public class Distinct {

    public static void main(String[] args) {

        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .map(String::length)
                .distinct()
                .subscribe(x -> System.out.println("Received: " + x));
    }

}
