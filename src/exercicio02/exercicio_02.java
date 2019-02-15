package exercicio02;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        System.out.println("Digite o valor do raio:");
        Scanner s = new Scanner(System.in);
        double raio = s.nextDouble();

        System.out.println("Digite o valor da altura:");
        Scanner s2 = new Scanner(System.in);
        double altura = s2.nextDouble();

        double resultado = Math.pow(raio,2)*altura*3.14;
        System.out.println("volume é igual á:" + resultado);
    }
}
