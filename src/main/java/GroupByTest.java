import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;

public class GroupByTest {

  public static void main(String[] args) {

    List<Integer> evenList = new ArrayList<>();
    List<Integer> oddsList = new ArrayList<>();

    Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    Observable.fromArray(numbers)
        .groupBy(number -> (number % 2 == 0) ? "EVEN" : "ODD")
        .subscribe(group ->
            group.subscribe(number -> {
              if (group.getKey().equals("EVEN")) {
                evenList.add(number);
              } else {
                oddsList.add(number);
              }
            }));

    System.out.println(evenList);
    System.out.println(oddsList);
  }
}
