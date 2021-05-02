package learningRxJava.operators.transforming;

import io.reactivex.Observable;

/*
Si nosotros queremos empezar mas de una emision, usamos el operador startWithArray() para aceptar un parametro varargs.
Si nosotros queremos agregar una division entre nuestra cabecera y los elementos, nosotros podemos empezar la cabecera
y dividir las emisiones.
 */
public class PlayWithStartWithArray {

  public static void main(String[] args) {

    Observable<String> menu = Observable.just("Coffee", "Tea", "Espresso", "Latte");

    //print menu
    menu.startWithArray("COFFEE SHOP MENU","----------------").subscribe(System.out::println);
  }

}
