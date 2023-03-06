package est.dio.streamAPI;

/*
* Crie uma lista ordenada com as seguintes informações
* id = 1 - contato = nome - number = 1111
* id = 2 - contato = nome - number = 2222
* id = 3 - contato = nome - number = 3333
* id = 4 - contato = nome - number = 4444
*
*
*
*
*
*/

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercice {
    public static void main(String[] args) {

        class Contact {
            private final String contact;
            private final Integer number;

            public Contact(String contact, Integer number) {
                this.contact = contact;
                this.number = number;
            }

            public String getContact() {
                return contact;
            }

            public Integer getNumber() {
                return number;
            }

            @Override
            public String toString() {
                return "Contact{" +
                        "contact='" + contact + '\'' +
                        ", number=" + number +
                        '}';
            }
        }

        Map<Integer, Contact> List = new HashMap<>();
        List.put(1, new Contact("Natan", 1111));
        List.put(2, new Contact("Vitória", 2222));
        List.put(3, new Contact("Carla", 3333));
        //Ordem de inserção
        for (Map.Entry<Integer, Contact> entry: List.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getContact() + " " + entry.getValue().getNumber());
        }




    }
}
