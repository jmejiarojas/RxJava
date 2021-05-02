package learningRxJava.operators.suppresing;

import io.reactivex.Observable;

/*
Al igual que distinct(), tu puedes proveer un argumento opcional para una llave a traves
de una lambda mapping. En el siguiente fragmento de codigo, nosotros ejecutamos la operacion
distinctUntilChanged() con cadenas codificadas en sus longitudes.
 */

public class DistinctUntilChangedLambda {

  public static void main(String[] args) {

    Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma", "Delta")
        .distinctUntilChanged(String::length)
        .subscribe(x -> System.out.println("Received: " + x));

  }

    /*
    Nota que "Zeta" ha sido omitido porque este viene directo despues de "Beta", el cual tiene
    4 caracteres. Delta es ignorado porque este sigue a "Gamma", cual tiene 5 caracteres tambien.
     */

}
