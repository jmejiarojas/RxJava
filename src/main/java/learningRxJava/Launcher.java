package learningRxJava;

import io.reactivex.Observable;

public class Launcher {

  public static void main(String[] args) {
    Observable<String> source = Observable.create(emitter -> {

      emitter.onNext("Alfa");
      emitter.onNext("Beta");
      emitter.onNext("Omega");
      emitter.onNext("Teta");
      emitter.onComplete();
    });

    source.subscribe(x -> System.out.println("Received: " + x));

  }

}
