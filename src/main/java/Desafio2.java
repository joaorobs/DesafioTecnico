import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contagemA = 0;

        System.out.println("Digite uma palavra: ");
        String palavra = scan.next();

        if (palavra.contains("a") || palavra.contains("A")) {
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == 'A' || palavra.charAt(i) == 'a') {
                    contagemA++;
                }
            }
        }
        System.out.println("A sua palavra tem " + contagemA + " 'A's.");

    }
}
