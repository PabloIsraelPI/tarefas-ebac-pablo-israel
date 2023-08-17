import java.util.Scanner;
public class Tentativa2TarefaModulo9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o valor a seguir:");

        int valor = scanner.nextInt();

        System.out.println("Voçê digitou:" + valor);
//A seguir é feito o casting.
        System.out.println("[Variavel primitiva]" + valor);

        Long valor2 = (long) valor;
        System.out.println("[Wrapper]" + valor2);

scanner.close();

    }
}
