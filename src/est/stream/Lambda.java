package est.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Lambda {
    public static void main(String[] args) {

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

        myCats.sort(Comparator.comparing((Cats cat) -> (cat.getIdade())));
        // Essa é a expressão lambda, escrita: (param) -> (corpo)
    }
}
