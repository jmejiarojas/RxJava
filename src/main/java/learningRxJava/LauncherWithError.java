package learningRxJava;

import io.reactivex.Observable;

public class LauncherWithError {

  public static void main(String[] args) {

    Observable<String> source = Observable.create(emitter -> {

      try {
        emitter.onNext("Alfa");
        emitter.onNext("Beta");
        emitter.onNext("Omega");
        emitter.onNext("Teta");
        emitter.onComplete();
      }catch (Throwable e){
        emitter.onError(e);
      }
    });

    source.subscribe(x -> System.out.println("Received: " + x), Throwable::printStackTrace);
  }

}
