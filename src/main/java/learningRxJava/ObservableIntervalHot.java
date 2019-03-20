package learningRxJava;

import io.reactivex.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

/*
Ahora el Observer 2, aunque 5 segundos despues y teniendo perdido las anteriores emisiones
, al menos esta completamente sincronizado con el Observer 1 y reciben las mismas
emisiones.
 */

public class ObservableIntervalHot {

  public static void main(String[] args) {

    ConnectableObservable<Long> seconds = ConnectableObservable
            .interval(1, TimeUnit.SECONDS)
            .publish();

    // Observer 1
    seconds.subscribe( x -> System.out.println("Observer 1: " + x));
    seconds.connect();


    // sleep 5 seconds
    sleep(5000);

    // Observer 2
    seconds.subscribe(x -> System.out.println("Observer 2: " + x));

    //sleep 5 seconds
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
