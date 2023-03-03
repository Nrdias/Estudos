import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Crie um programa que faça 5 perguntas para uma pessoa, das quais:
 * <p>Perguntas = ["Telefonou para a vítima", "Esteve no local do crime?", "Mora perto da vítima", "Devia par para a vítima", "Já trabalhou com a vítima"]</p>
 * <br>
 * <p>Ele deverá ler o input do usuário e armazená-lo</p>
 * <br>
 * <p>No final ele deverá validar as respostas e dar um retorno conforme o numero de sins e nãos</p>
 * <ul>
 *     <li>0 - 1 = Inocente</li>
 *     <li>2 = Suspeito</li>
 *     <li>3 - 4 = Cúmplice</li>
 *     <li>5 = Assasino</li>
 * </ul>
 * @author ndias
 * @since 03/03/2023
 *
 * */

public class Questionary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] questions = {"Telefonou para a vítima?", "Esteve no local do crime?","Mora perto da vítima?","Devia par para a vítima?","Já trabalhou com a vítima?"};
        ArrayList<String> answers = new ArrayList<>();
        int suspicious = 0;

        for (String question : questions) {
            System.out.println(question);
            String answer = input.nextLine();
            answers.add(answer);

            if(!Objects.equals(answer, "Sim") && !Objects.equals(answer, "Não") && !Objects.equals(answer, "sim") && !Objects.equals(answer, "não")){
                System.out.println("Resposta inválida, reinicie!");
                return;
            }
        }
        for(int i = 0; i < answers.size(); i++){
            System.out.println(questions[i] + ": " + answers.get(i));
        }

        for (String answer: answers
             ) {
            if(answer == "Sim" || answer == "sim"){
                suspicious++;
            }
        }
        switch (suspicious){
            case 0:
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeito(a)");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino(a)");
        }
        System.out.println("Fim do programa!");
    }
}

