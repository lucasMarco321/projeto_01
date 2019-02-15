package exercicio01;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        System.out.println("Digite o valor da conta:");
        Scanner s = new Scanner(System.in);
        double conta = s.nextDouble();
        double resultado = 1.1;
        System.out.println("valor da conta:" + resultado*conta);
    }
}
