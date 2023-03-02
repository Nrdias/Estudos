import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1 - Crie um programa que receba a temperatura dos 6 primeiros meses do ano
 * 1.1 - Retorne a média semestral
 * 1.2 - Mostre todas as temperaturas acima da média, e em que mês elas ocorreram
 *
 * 2 - Crie um programa que faça 5 perguntas para uma pessoa, das quais:
 * String perguntas = ["Telefonou para a vítima", "Esteve no local do crime?", "Mora perto da vítima", "Devia par para a vítima", "Já trabalhou com a vítima"];
 *
 *
 * */

public class OrdenedList{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] questions = {"Telefonou para a vítima?", "Esteve no local do crime?","Mora perto da vítima?","Devia par para a vítima?","Já trabalhou com a vítima?"};
        ArrayList<String> answers = new ArrayList<String>();

        for (String question : questions) {
            System.out.println(question);
            answers.add(input.next());
        }
    }

    /**
     * TODO Implementar a verificação das respostas:
     * Se sim:
     * 0-1 - Inocente
     * 2 - Suspeita
     * 3-4 - Cúmplice
     * 5 - Assassina
     * */

}

