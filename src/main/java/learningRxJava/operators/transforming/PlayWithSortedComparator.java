package learningRxJava.operators.transforming;

import io.reactivex.Observable;
import java.util.Comparator;

public class PlayWithSortedComparator {

  public static void main(String[] args) {

    /*
    Tu puedes proveer un Comparator como un argumento para especificar un criterio de sorted explicito.
    Nosotros podemos proveer un Comparator para invertir el orden de clasificacion.
    */
    Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
        .sorted(Comparator.reverseOrder())
        .subscribe(System.out::println);

    /*
    Dado que Comparator es una interfaz de metodo abstracto unico, puede implementarlo con una lambda.
    Especifique los dos parametros que representan dos emisiones.
     */
    Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
        .sorted((x, y) -> Integer.compare(x.length(), y.length()))
        .subscribe(System.out::println);
  }
}

