import io.reactivex.Observable;
import io.reactivex.Single;


public class SingleTest {
  public static void main(String[] args) {

    String[] result = {""};
    Single<String> single = Observable.just("Hello")
            .single("No se pudo transformar a single")
            .doOnSuccess( cadena -> result[0] += cadena)
            .doOnError( throwable -> {
              throw new RuntimeException(throwable.getMessage());
            });

    single.subscribe(s -> System.out.println(s));

  };
}
