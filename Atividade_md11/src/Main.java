import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> listaDeNomes = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes a seguir:");

        String input = scanner.nextLine();
        listaDeNomes.add(input);


        System.out.println(listaDeNomes);

        scanner.close();

    }
}