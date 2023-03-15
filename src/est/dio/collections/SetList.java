package est.dio.collections;

import java.util.*;


/*
* Interface Set:
* Não permite elementos duplicados
* Não possui Indice
*
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

        boolean exist = notas.contains(7d);
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        for (Double item: notas) {
            soma += iterator.next();
        }

        System.out.println(notas);
        System.out.println(exist);
        System.out.println(soma);

        notas.remove(7d);


        class Cats implements Comparable<Cats>{
            private String name;
            private String color;
            private Integer idade;

            public Cats(String name, String color, Integer idade){
                this.name = name;
                this.color = color;
                this.idade = idade;
            }

            public String getName(){
                return name;
            }
            public String getColor(){
                return color;
            }
            public Integer getIdade(){
                return idade;
            }

            @Override
            public String toString() {
                return "Cats{" +
                        "name='" + name + '\'' +
                        ", color='" + color + '\'' +
                        ", idade=" + idade +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Cats cats = (Cats) o;
                return Objects.equals(name, cats.name) && Objects.equals(color, cats.color) && Objects.equals(idade, cats.idade);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, color, idade);
            }

            @Override
            public int compareTo(Cats idade) {
                return Integer.compare(this.getIdade(), idade.getIdade());

            }
        }

        Set<Cats> myCats = new HashSet<>();

        // Lista sem ordem

        myCats.add(new Cats("Castiel","White", 1));
        myCats.add(new Cats("Frajola","Black", 1));
        myCats.add(new Cats("Faísca","Black", 3));

        for (Cats cat: myCats) {
            System.out.println(cat.getName() + " - " +  cat.getColor() + " - " + cat.getIdade() );
        }

        Set<Cats> myCats1 = new LinkedHashSet<>();

        // Lista ordenada por inserção

        myCats1.add(new Cats("Castiel","White", 1));
        myCats1.add(new Cats("Frajola","Black", 2));
        myCats1.add(new Cats("Faísca","Black", 3));

        for (Cats cat: myCats1) {
            System.out.println(cat.getName() + " - " +  cat.getColor() + " - " + cat.getIdade() );
        }
        // Lista ordenada naturalmente

        Set<Cats> myCats2 = new TreeSet<>(myCats1);
        System.out.println(myCats2);
    }

}
