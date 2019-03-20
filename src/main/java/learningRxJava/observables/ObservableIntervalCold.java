package learningRxJava.observables;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/*
Mira lo que sucedio despues de que transcurriera cinco segundos, cuando entro el Observer 2.
Tenga en cuenta que es en su propio timer separado y comenzando en cero!. Estos dos Observers
estan actualmente recibiendo sus propias emisiones, cada una a partir de cero. Asi que
actualmente este Observable es "cold". Poner a todos los observables en el mismo timer con
las mismas emisiones, para eso desearia usar ConnectableObservable.
 */

public class ObservableIntervalCold {

  public static void main(String[] args) {

    Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);

    // Observer 1
    seconds.subscribe( x -> System.out.println("Observer 1: " + x));

    // sleep 5 seconds
    sleep(5000);

    // Observer 2
    seconds.subscribe(x -> System.out.println("Observer 2: " + x));

    sleep(5000);

  }

  public static void sleep(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
