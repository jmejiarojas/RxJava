import io.reactivex.Observable;

public class App2 {
  public static void main(String[] args) {
    String[] avengers = {"Hulk", "Iron man", "Loki"};

//    avengers = null;

    Observable<String> avengersObservable = Observable.fromArray(avengers);

    avengersObservable
            .filter(avenger -> !avenger.equalsIgnoreCase("Loki"))
            .subscribe(
                    avenger -> System.out.println(avenger),
                    Throwable::printStackTrace,
                    () -> System.out.println("completed!!")
            );
  }
}
