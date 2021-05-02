import io.reactivex.Observable;


public class MapTest {

  private static String result = "";

  public static void main(String[] args) {

    // Lo que vamos a hacer es encadenar todos estas letras usando Map, ademas de pasarlos a mayusculas

    String[] letters = {"a", "b", "c", "d", "e"};

    Observable<String> observable = Observable.fromArray(letters);

    observable
        .map(String::toUpperCase)
        .subscribe(
            letter -> result += letter,
            Throwable::printStackTrace
        );

    System.out.println(result);

  }

}
