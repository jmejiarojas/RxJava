package learningRxJava.operators.transforming;

import io.reactivex.Observable;

/*
Por supuesto, esto puede tener algunas implicaciones en el rendimiento, ya que recopilará todas las emisiones en la memoria antes de volver a emitirlas.
Si usa esto contra un Observable infinito, puede obtener un error OutOfMemory.
 */
public class PlayWithSorted {

  public static void main(String[] args) {
    Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
        .sorted()
        .subscribe(System.out::println);
  }

}
