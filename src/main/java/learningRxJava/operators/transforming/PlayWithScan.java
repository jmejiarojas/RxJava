package learningRxJava.operators.transforming;

import io.reactivex.Observable;

public class PlayWithScan {

  public static void main(String[] args) {

    /*
    El metodo scan() es un "rolling agregator". Para cada emision, la agregara a una acumulacion. Luego,
    emitira cada acumulacion incremental.
    */
    Observable.just(5, 3, 7, 10, 2, 14)
        .scan((accumulator, next) -> accumulator + next)
        .subscribe(s -> System.out.println("Received: " + s));

    /*
    También puede proporcionar un valor inicial para el primer argumento y agregarlo a un tipo diferente al que se está emitiendo.
    Si quisiéramos emitir el recuento continuo de emisiones, podemos proporcionar un valor inicial de 0 y simplemente agregarle 1 por cada emisión.
    Tenga en cuenta que el valor inicial se emitirá primero, así que use skip (1) después de escanear () si no desea esa emisión inicial:
     */
    Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
        .scan(0, (total, next) -> total + 1)
        .subscribe(s -> System.out.println("Received: " + s));
  }

}
