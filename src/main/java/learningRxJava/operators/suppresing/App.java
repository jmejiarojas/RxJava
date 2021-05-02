package learningRxJava.operators.suppresing;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

public class App {
  public static void main(String[] args) {

    Observable<String> avengers = Observable.create(observableEmitter -> emitAvengers(observableEmitter));

    avengers
        .filter(avenger -> !avenger.equalsIgnoreCase("Loki"))
        .map(avenger -> avenger + " is a avenger")
        .subscribe(s -> System.out.println(s));


  }

  private static void emitAvengers(ObservableEmitter<String> observableEmitter) {
    observableEmitter.onNext("IronMan");
    observableEmitter.onNext("Loki");
    // observableEmitter.onComplete();
    observableEmitter.onNext("Hulk");
  }
}
