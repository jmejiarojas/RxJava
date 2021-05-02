package learningRxJava.operators.transforming;

import io.reactivex.Observable;

/*
Dado un Observable<T>, el operador startWith() permitira insertar una emision T que precede a todas las otras emisiones.
Por ejemplo, si nosotros tenemos un Obserable<String> que emite emisiones de elementos de un menu que nosotros queremos
imprimir, nosotros usaremos startWith() para agregar una cabecera de titulo al inicio:
 */

public class PlayWithStartWith {

  public static void main(String[] args) {

    Observable<String> menu = Observable.just("Coffee", "Tea", "Espresso", "Latte");

    menu.startWith("COFFEE SHOP MENU").subscribe(System.out::println);
  }

}
