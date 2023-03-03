package est.dio.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*
* Interface Set:
* Não permite elementos duplicados
* Não possui Indice
*
* 1 HashSet: ->
* 1.1 usa hashmap para guardar elementos
* 1.2 não mantém qualquer ordem de elementos
* 1.3 tem a melhor performance
* 1.4 permite um elemento null
*
* 2 LinkeHashSet: ->
* 2.1 usa linkedhashmap para guardar elementos
* 2.2 mantém a ordem de inserção de elementos
* 2.3 tem a segunda melhor performance
* 2.4 permite um elemento null
*
* 3 treeSet: ->
* 3.1 Usa treemap par guardar elementos
* 3.2 Mantém a ordem natural dos elementos
* 3.3 Tem a pior performance
* 3.4 não permite elemento null
* */
public class SetList {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(3.6);

        boolean existe = notas.contains(7d);
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        for (Double item: notas) {
            soma += iterator.next();
        }

        System.out.println(notas);
        System.out.println(existe);
        System.out.println(soma);

        notas.remove(7d);

    }

}
