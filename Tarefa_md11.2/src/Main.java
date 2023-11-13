import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes com gêneros separados por '-', digite 'Fim' para encerrar:");
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Fim")) {
                break;
            }

            String[] nomes = input.split("-");

            if (nomes.length == 2) {
                String nome = nomes[0].trim();
                String genero = nomes[1].trim();

                if (genero.equalsIgnoreCase("M")) {
                    nomesMasculinos.add(nome);
                } else if (genero.equalsIgnoreCase("F")) {
                    nomesFemininos.add(nome);
                } else {
                    System.out.println("Gênero inválido: " + genero);
                }

            } else {
                System.out.println("Formato inválido. Use 'Nome-M' para masculino ou 'Nome-F' para feminino.");
            }

        }

        System.out.println("Nomes Masculinos: " + nomesMasculinos);
        System.out.println("Nomes Femininos: " + nomesFemininos);

        scanner.close();
    }
}
