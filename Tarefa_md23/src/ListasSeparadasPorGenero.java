import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListasSeparadasPorGenero {
    private List<String> nomesMasculinos = new ArrayList<>();
    private List<String> nomesFemininos = new ArrayList<>();

    public List<String> getNomesFemininos() {
        return nomesFemininos;
    }

    public static void main(String[] args) {
        ListasSeparadasPorGenero programa = new ListasSeparadasPorGenero();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes abaixo, como mostrado no exemplo:");
        System.out.println("Para masculino: Nome - M");
        System.out.println("Para feminino: Nome - F");
        System.out.println("Digite 'fim' ao terminar.");

        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            String[] partes = entrada.split(" - ");
            if (partes.length == 2) {
                String nome = partes[0];
                char genero = partes[1].toUpperCase().charAt(0);

                if (genero == 'M') {
                    programa.nomesMasculinos.add(nome);
                } else if (genero == 'F') {
                    programa.nomesFemininos.add(nome);
                } else {
                    System.out.println("Gênero inválido para: " + entrada);
                }
            } else {
                System.out.println("Formato inválido. Use o formato: Nome - Gênero");
            }
        }

        System.out.println("Nomes Masculinos: " + programa.nomesMasculinos);
        System.out.println("Nomes Femininos: " + programa.nomesFemininos);

        List<String> segundaLista = new ArrayList<>();

        programa.nomesFemininos.forEach(item -> segundaLista.add(item));

        System.out.println("Segunda lista:" + segundaLista);

        scanner.close();
    }
}
