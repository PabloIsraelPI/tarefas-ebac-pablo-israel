import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaDeNomesOrdenada {
    public static void main(String[] args) {
        List<String> listaDeNomes = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes abaixo (digite 'fim' para parar):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fim")) {
                break;
            }
            listaDeNomes.add(input);
        }

        // Ordenar a lista de nomes em ordem alfabética
        Collections.sort(listaDeNomes);

        System.out.println("Lista ordenada de nomes: " + listaDeNomes);

        scanner.close();
    }
}