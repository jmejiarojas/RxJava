package learningRxJava.observables;

import io.reactivex.Observable;

/*
Los Cold Obervables son muy parecidos a un CD de musica que ṕuede ser reproducido por cada
escucha, asi cada persona puede oir todos las canciones en cualquier tiempo. De la misma
manera, Cold Observables reproducen las emisiones a cada Observer, asegurando que todos los
Observers reciban toda la data. La mayoria de manejadores de data son "cold", y estos
incluye a Observable.just() y Observable.fromIterable() factories.

En el siguiente ejemplo, nosotros tenemos dos Observers suscritos a un Observable. El
Observable primero reproducira todas las emisiones al primer Observer y entonces llamara
onComplete(). Entonces, este reproducira todas las emisiones contra el segundo Observer
y llamara onComplete(). Ellos, ambos, recibiran el mismo dataSet al obtener dos streams
separados cada uno, que es el tipico comportamiento de un Cold Observable.

Podemos concluir que los Observables sources que emiten datasets finitos son usualmente
"cold".

 */

public class ColdObservables {

  public static void main(String[] args) {

    Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

    // first observer
    source
        .subscribe(x -> System.out.println("Observer 1 Received: " + x));

    // second observer
    source
        .subscribe(x -> System.out.println("Observer 2 Received: " + x));


  }

}
