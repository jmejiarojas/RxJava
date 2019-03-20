package learningRxJava.observables;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

/*
Nosotros podemos usar Observable.fromIterable() para emitir los items desde algun Iterable type,
por ejemplo un List. Este tambien llamara a onNext para cada elemento y despues llamara a onComplete()
cuando la iteracion este completa. Es muy probable que use este factory con frecuencia, ya que los
Iterables en Java son comunes y se pueden hacer "reactivos" facilmente.
 */

public class ObservableFromIterable {

  public static void main(String[] args) {

    List<String> items = Arrays.asList("Alpha", "Beta", "Gamma", "Delta",
            "Epsilon");

    Observable<String> source = Observable.fromIterable(items);

    // Procedemos a "operarlo" y a imprimirlo por pantalla
    source
            .map(String::length)
            .filter(x -> x >= 5)
            .subscribe(x -> System.out.println("Received: " + x));

  }

}
