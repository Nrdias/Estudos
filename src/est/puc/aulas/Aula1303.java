package est.puc.aulas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula1303 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.println("3 - Arredonde um número double para até 2 casas decimais.");
        double valorDaCompra = 19.93;
        double pagamento = 20.0;
        double diferenca = pagamento - valorDaCompra;
        System.out.printf("%.2f", diferenca);
        System.out.println("");


        System.out.println("4 — Faça um programa que leia o valor do raio, e cálcule a área => A = 4rπ²");
        System.out.print("Informe o raio: ");
        double raio = in.nextDouble();
        double area = 4*Math.PI*Math.pow(raio,2);
        System.out.println("O valor da area é: " + area);

        System.out.println("5 - Implemente um programa que leia um valor n e retorne n2, n3 e n4");
        System.out.print("Informe o valor de n: ");
        double n = in.nextDouble();
        for(int i = 1; i <= 4; i++){
            double val = Math.pow(n, i);
            System.out.println("n" + i + " = " + val);
        }

        System.out.println("6 - Faça um programa que converta de Fahrenheit para Celcius");
        System.out.print("Informe a temperatura em fahrenheit: ");
        double f = in.nextDouble();
        double celcius = (5.0 / 9) * (f - 32);
        System.out.println("A temperatura em celcius é: " + format.format(celcius));

        System.out.println("7 - Faça um programa que leia dois valores inteiros e imprima as operações: ");
        System.out.print("Informe o valor de num1: ");
        int num1 = in.nextInt();
        System.out.print("Informe o valor de num2: ");
        int num2 = in.nextInt();
        int soma = num1 + num2;
        int diferenca2 = num1 - num2;
        double media = (num1 + num2)/2.0;
        int distancia = Math.abs(num1 - num2);
        double maior = Math.max(num1, num2);
        double menor = Math.min(num1, num2);
        System.out.println("Valor da soma: " + soma);
        System.out.println("Valor da diferença: " + diferenca2);
        System.out.println("Valor da média: " + media);
        System.out.println("Valor da distancia: " + distancia);
        System.out.println("Valor do maior: " + maior);
        System.out.println("Valor do menor: " + menor);

        System.out.println("8 - ");

    }
}
