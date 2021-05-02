package learningRxJava.observers;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*
Cuando llamamos al metodo "subscribe()" en un Observable, un Observer es usado para consumir estos tres
eventos implementando esos metodos. A pesar de especificar argumentos lambda como lo hicismos en ejemplos
anteriores, nosotros podemos implementar un "Observer" y pasar una instancia de este al metodo "subscribe()".
No te molestes acerca de "onSubscribe()" por el momento. Solo deja esta implementacion vacia hasta que
nosotros discutamos esto en el final del capitulo.
 */

public class ObserverSubscribe {

  public static void main(String[] args) {

    Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

    // Este Observer va a recibir emisiones de Integers de un Observable,
    // en este caso del Observable source.
    Observer<Integer> observer = new Observer<Integer>() {
      @Override
      public void onSubscribe(Disposable disposable) {
        // No hace nada con disposable, despreocupate por ahora.
      }

      @Override
      public void onNext(Integer integer) {
        System.out.println("Received: " + integer);
      }

      @Override
      public void onError(Throwable throwable) {
        throwable.printStackTrace();
      }

      @Override
      public void onComplete() {
        System.out.println("Done");
      }
    };

    source
        .map(String::length)
        .filter(x -> x >= 5)
        .subscribe(observer);

  }

}
