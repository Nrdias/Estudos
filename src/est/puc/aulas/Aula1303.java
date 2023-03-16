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

        System.out.println("8 - Faça um programa que leia as dimensões de um terreno e de uma casa, e retornar o valor livre do terreno ");
        System.out.print("Informe o comprimento da casa: ");
        double compCasa = in.nextDouble();
        System.out.print("Informe a lagura da casa: ");
        double largCasa = in.nextDouble();
        System.out.print("Informe o comprimento do terreno: ");
        double compTerr = in.nextDouble();
        System.out.print("Informe a largura da terreno: ");
        double largTerr = in.nextDouble();

        double areaCasa = compCasa * largCasa;
        double areaTerreno = compTerr * largTerr;
        double areaLivre = areaTerreno - areaCasa;

        System.out.println("A casa possuí " + areaCasa + " de área e terreno " + areaTerreno );
        System.out.println("A área livre é: " + areaLivre);

        System.out.println("9 - Faça um programa que leia a altura da pessoa em metros e mostre a altura em centímetros");
        System.out.print("Informe a altura em metros: ");
        double metros = in.nextDouble();
        double centimetros = metros * 100;

        System.out.println("A altura em centímetros é: " + centimetros + "cm");

        System.out.println("10 - Transforme um tempo em segundos em horas, minutos e segundos");

        int segundos = in.nextInt();
        int minutos = segundos / 60;
        int horas = minutos / 60;
        segundos = segundos % 60;
        minutos = minutos % 60;

        System.out.println("O valor decomposto é: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
        
        System.out.println("11 - implemente um programa que leia um número inteiro e o retorne invertido. 1234 -> 4321");
        int valor = in.nextInt();
        /*
        String numeros = String.valueOf(valor);
        String[] array;
        array = numeros.split("");
        numeros = array[3]+array[2]+array[1]+array[0];
        valor = Integer.parseInt(numeros);
        */
        int primeiro = (valor/ 1000)%10;
        int segundo = (valor / 100)%10;
        int terceiro = (valor / 10)%10; 
        int quarto = valor%10;
        
        int valor2 = ((quarto * 1000) + (terceiro * 100) + (segundo * 10) + primeiro);

            System.out.println("O valor invertido é: " + valor2);
    }
}
