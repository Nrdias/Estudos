package est.dio.collections;

import java.util.*;

public class MapList {
    public static void main(String[] args) {

        /*
        * Dados modelos de carros:
        * modelo = gol - consumo = 14,4km/l
        * modelo = uno - consumo = 15,6km/l
        * modelo = mobi - consumo = 16,1km/l
        * modelo = hb20 - consumo = 14,5km/l
        * modelo = kwid - consumo = 15,6km/l
        */

        Map<String, Double> Cars = new HashMap<>();
        Cars.put("gol", 14.4);
        Cars.put("uno", 15.6);
        Cars.put("mobi", 16.1);
        Cars.put("hb20", 14.5);
        Cars.put("kwid", 15.6);

        System.out.println(Cars);
        // Substituir o consumo do gol por 15.2 -> Chamar a key e atribuir um novo valor
        Cars.put("gol", 15.2);
        System.out.println(Cars);
        // Verificar se um modelo está no map
        System.out.println(Cars.containsKey("mobi"));
        // Exiba o valor e consumo de um modelo
        System.out.println(Cars.get("uno"));
        // Exiba os modelos
        Set<String> models = Cars.keySet();
        System.out.println(models);
        // Exiba o consumo
        Collection<Double> autonomys = Cars.values();
        System.out.println((autonomys));

        //Ordenando MapList

        class Books{
            private final String name;
            private final Integer pages;

            Books(String name, Integer pages){
                this.name = name;
                this.pages = pages;
            }

            public String getName(){
                return name;
            }

            public Integer getPages(){
                return pages;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Books books = (Books) o;
                return Objects.equals(name, books.name) && Objects.equals(pages, books.pages);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, pages);
            }

            @Override
            public String toString() {
                return "Books{" +
                        "name='" + name + '\'' +
                        ", pages=" + pages +
                        '}';
            }
        }

        class ComparatorName implements Comparator<Map.Entry<String, Books>>{
            @Override
            public int compare(Map.Entry<String, Books> o1, Map.Entry<String, Books> o2) {
                return o1.getValue().getName().compareToIgnoreCase(o2.getValue().getName());
            }
        }

        Map<String, Books> myBooks = new HashMap<>();
        myBooks.put("Rick", new Books("Percy Jackson", 200));
        myBooks.put("JK", new Books("Harry Potter", 300));


        // Ordem Qualquer
        for (Map.Entry<String, Books> book:
             myBooks.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        }

        Map<String, Books> myBooks1 = new LinkedHashMap<>();
        myBooks1.put("Rick", new Books("Percy Jackson", 200));
        myBooks1.put("JK", new Books("Harry Potter", 300));
        // Ordem de Inserção
        for (Map.Entry<String, Books> book:
                myBooks1.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        }

        Map<String, Books> myBooks2 = new TreeMap<>(myBooks1);

        //Ordem Alfabética - Autores
        for (Map.Entry<String, Books> book:
                myBooks2.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        }
        //Ordem Alfábetica - Livros
        Set<Map.Entry<String, Books>> myBooks3 = new TreeSet<>(new ComparatorName());
        myBooks3.addAll(myBooks2.entrySet());
        for (Map.Entry<String, Books> book:
                myBooks3) {
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        }

    }

}
