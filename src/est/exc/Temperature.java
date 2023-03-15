package est.exc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crie um programa que receba a temperatura dos 6 primeiros meses do ano
 * Retorne a média semestral
 * Mostre todas as temperaturas acima da média, e em que mês elas ocorreram
 *
 *
 *
 *
 */
public class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] temperature = new int[5];
        int i = 0;
        double sum = 0;
        double media = 0;

        while(i < 5){
            System.out.println("Informe o " + i);
            temperature[i] = input.nextInt();
            i++;
        }

        for (int temp:temperature
             ) {
            sum += temp;
        }
        media = sum / temperature.length;
        System.out.println("As temperaturas são: " + Arrays.toString(temperature));
        System.out.println("A média é: " + media);






    }
}
