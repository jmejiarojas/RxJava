import io.reactivex.Observable;

public class FlatMapTest {

  public static void main(String[] args) {

    String[] letters = {"a", "b", "c", "d", "e"};

    Observable<String> observable = Observable.fromArray(letters);

    observable
        .flatMap(letter -> mapToObservable(letter))
        .subscribe(System.out::println);


  }

  private static Observable<String> mapToObservable(String letter) {
    return Observable.just(letter);
  }
}
