package learningRxJava.operators.transforming;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;

/*
Nosotros podemos postponer emisiones usando el operador delay(). Retendra las emisiones recibidas y retrasara cada una
durante el periodo de tiempo especificado. Si quisieramos retrasar las emisiones por 3 segundos podriamos hacerlo asi:
 */
public class PlayWithDelay {

  public static void main(String[] args) {

    // No hace delay por cada emision sino hace un stop de 3 segundos y vota todas las emisiones.
    Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
        .delay(3, TimeUnit.SECONDS)
        .subscribe(s -> System.out.println("Received: " + s));

    sleep(5000);
  }

  /*
  Debido a que delay () opera en un Scheduler diferente (como Observable.interval()), necesitamos aprovechar un método sleep()
  para mantener la aplicación activa el tiempo suficiente para que esto suceda.
   */
  public static void sleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
