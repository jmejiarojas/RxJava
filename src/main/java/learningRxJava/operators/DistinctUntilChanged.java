package learningRxJava.operators;

import io.reactivex.Observable;

/*
La funcion distinctUntilChanged() ignorara las emisiones duplicadas consecutivas. Es una forma util
de ignorar las repeticiones antes que cambien. Si se esta emitiendo el mismo valor repetidamente
, todos los duplicados se ignoraran hasta que se emita un nuevo valor. Duplicados de el siguiente
valor se ignorara hasta que cambien otra vez, y asi sucesivamente. Observe la salida para el siguiente
codigo para ver este comportamiento en accion:
 */
public class DistinctUntilChanged {

    public static void main(String[] args) {

        Observable.just(1, 1, 1, 2, 2, 3, 3, 2, 1, 1)
                .distinctUntilChanged()
                .subscribe(x -> System.out.println("Received:" + x));


    }

    /*
    Explicacion de lo que va a salir en pantalla:

    Nosotros recibimos una emision de "1", que esta permitido hacia adelante. Pero los proximos dos "1"
    son ignorados porque son los consecutivos duplicados. Cuando esto cambia a "2", ese inicial "2" es
    emitido, pero el siguiente "2" duplicado es ignorado. Un "3" es emiitido y el siguiente duplicado
    es ignorado como bien. Finalmente, volvemos a un "2" que emite y luego un "1" cuyo duplicado
    es ignorado.

     */

}
