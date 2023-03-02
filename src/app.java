import java.util.Scanner;

/**
* @author ndias
* @since 02/03/2023
* @version 1.0
*
* <h2>Exércicio IV - Representar as equacões em java:</h2>
* <p>1- (((∛a+3b/b+1)+b^5)/|b-a|) + (√(√a+1)/(b+3a+ba^5))-1 </p>
* <p>2- (+ab^a+1) - (((a+3b)/(a+b-1))/|2b-a^3-1|)</p>
*
* */
public class app {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor para variável a:");
        double a = Double.parseDouble(input.next());
        System.out.println("Insira o valor para variável b:");
        double b = Double.parseDouble(input.next());

        double equation = (Math.cbrt((a + b * 3) / (b + 1) + Math.pow(b, 5)) / Math.abs(b - a)) + (((Math.sqrt(Math.sqrt(a) + 1)) / (b + (3 * a) + (b * Math.pow(a, 5)))) - 1);
        double equation2 = (6 * a * Math.pow(b, a + 1)) - ((a + (3 * b)) / ((a + b) - 1) / Math.abs(2 * b - Math.pow(a, 3) - 1));

        System.out.println(equation);
        System.out.println(equation2);
    }
}
