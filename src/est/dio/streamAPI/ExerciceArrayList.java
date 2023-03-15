package est.dio.streamAPI;

/*
* Crie uma lista com as seguintes informações
* id = 1 - contato = nome - number = 1111
* id = 2 - contato = nome - number = 2222
* id = 3 - contato = nome - number = 3333
* id = 4 - contato = nome - number = 4444
*/


import java.util.ArrayList;
import java.util.Objects;

public class ExerciceArrayList {
    public static void main(String[] args) {

        class Contatos{
            private int id;
            private String contact;
            private int number;

            Contatos(int id, String contact, int number){
                this.id = id;
                this.contact = contact;
                this.number = number;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getContact() {
                return contact;
            }

            public void setContact(String contact) {
                this.contact = contact;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Contatos contatos = (Contatos) o;
                return id == contatos.id && number == contatos.number && Objects.equals(contact, contatos.contact);
            }

            @Override
            public int hashCode() {
                return Objects.hash(id, contact, number);
            }

            @Override
            public String toString() {
                return "Contatos{" +
                        "id=" + id +
                        ", contact='" + contact + '\'' +
                        ", number=" + number +
                        '}';
            }
        }
        ArrayList<Contatos> list = new ArrayList<>();
        list.add(new Contatos(1, "Natan", 1111));
        list.add(new Contatos(2, "Dias", 2222));

        System.out.println(list.get(0).getContact());

    }
}
