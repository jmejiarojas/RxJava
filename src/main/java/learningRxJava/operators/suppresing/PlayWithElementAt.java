package learningRxJava.operators.suppresing;

import io.reactivex.Observable;

/*
Tu puedes obtener una emision especifica por un indice especifico Long, el indice empieza en 0. Despues que el item
es encontrado y emitido, el metodo onComplete() sera llamado y se eliminara la suscripcion.

Tu puedes no haberlo notado pero elementAt() retorna un Maybe<T> en vez de un Observable<T>. Esto se debe a que producira
una emision, pero si hay menos emisiones que el indice buscado, este sera vacio.

 */
public class PlayWithElementAt {

  public static void main(String[] args) {

    Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma",
        "Delta")
        .elementAt(3)
        .subscribe(i -> System.out.println("RECEIVED: " + i)); // Eta
  }

}
