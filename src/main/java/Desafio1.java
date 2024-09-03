import java.util.ArrayList;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> sequenciaFibonacci = new ArrayList<>();
        sequenciaFibonacci.add(0);
        sequenciaFibonacci.add(1);

        for (int i= 1; i < 30; i++) {
            sequenciaFibonacci.add(sequenciaFibonacci.get(i) + sequenciaFibonacci.get(i-1));
        }

        System.out.println("Digite um número: ");
        int numeroBusca = scan.nextInt();

        if (sequenciaFibonacci.contains(numeroBusca)) {
            System.out.println("O numéro está na sequência");
        } else {
            System.out.println("O número não está na sequência");
        }

    }
}
