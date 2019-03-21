package learningRxJava.operators;

import io.reactivex.Observable;

/*
Al igual que el metodo takeWhile(), hay un operador skipWhile(). Este omitira las emisiones mientras
cualifiquen con una condicion. El momento en que la condicion no califique mas, la emision
comenzara a pasar. En  el siguiente codigo, nosotros omitimos como siempre cuando ellos sean menores
o igual a 95. El momento que una emision es encontrada que no conoce esta condicion, esto permitira
todas las subsequentes emisiones avancen.
 */

public class SkipWhile {

    public static void main(String[] args) {

        Observable.range(1, 100)
                .skipWhile(x -> x <= 95)
                .subscribe(x -> System.out.println("Received:" + x));

    }

}
