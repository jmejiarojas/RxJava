package learningRxJava.operators.transforming;

import io.reactivex.Observable;

public class PlayWithCast {

  public static void main(String[] args) {
    /*
    Un simple operador "map" para convertir cada emision a un tipo diferente es cast(). Si nosotros queremos tomar Observable<String>
    y castear cada emision a un Object( y retornar un Observable<Object>), nosotros podriamos usar el operador map() como este:
    */
    Observable<Object> items = Observable.just("Alpha", "Beta", "Gamma").map(s -> (Object) s);

    /*
    Pero una forma mas corta nosotros podemos usar es cast(), y nosotros podemos simplemente pasar el tipo de la clase que nosotros
    queremos castear. como se muestra en el siguiente fragmento de codigo:
     */
    Observable<Object> itemsCast = Observable.just("Alpha", "Beta", "Gamma").cast(Object.class);
  }
}
