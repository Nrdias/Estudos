package est.stream;

import java.util.*;

public class AnonymousClasses {

    public static void main(String[] args) {
        // An anonymous classes is defined by a class that will be declarated && instanced at the same time.

        class Cats {
            private final String name;
            private final String color;

            private final Integer idade;

            public Cats(String name, String color, Integer idade) {
                this.name = name;
                this.color = color;
                this.idade = idade;
            }

            public String getName() {
                return name;
            }

            public String getColor() {
                return color;
            }

            public Integer getIdade() {
                return idade;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Cats cats = (Cats) o;
                return name.equals(cats.name) && color.equals(cats.color) && idade.equals(cats.idade);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, color, idade);
            }
        }

        List<Cats> myCats = new ArrayList<>();

        myCats.add(new Cats("Castiel", "White", 1));
        myCats.add(new Cats("Frajola", "Black", 2));

        myCats.sort(new Comparator<Cats>() {
            //Aqui chamamos o Comparator direto no método -> .sort da ArrayList
            @Override
            public int compare(Cats o1, Cats o2) {
                return Integer.compare(o1.getIdade(), o2.getIdade());
            }
        });

        /*
         Como seria normalmente feito:

         @class CompararGatos implements Comparator<Cats>{
        *   public int compare(Cats o1, Cats o2) {
        *       return Integer.compare(o1.getIdade(), o2.getIdade());
        *   }
        * }
        *
        * E então chamariamos no método -> .sort:
        *
        * @myCats.sort(new CompararGatos());
        *
        * Caso fossemos utilizar o método para comparar mais de uma vez, o ideal seria que se criasse
        * uma classe como foi feito no exemplo acima, mas como utilizamos somente uma vez, podemos
        * fazer a declaração&instância diretamente no método -> .sort
        *
        * */



    }
}