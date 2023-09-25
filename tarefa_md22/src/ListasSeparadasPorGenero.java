import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListasSeparadasPorGenero {
    public static void main(String[] args) {
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

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
                    nomesMasculinos.add(nome);
                } else if (genero == 'F') {
                    nomesFemininos.add(nome);
                } else {
                    System.out.println("Gênero inválido para: " + entrada);
                }
            } else {
                System.out.println("Formato inválido. Use o formato: Nome - Gênero");
            }
        }

        System.out.println("Nomes Masculinos: " + nomesMasculinos);
        System.out.println("Nomes Femininos: " + nomesFemininos);

        // ****AQUI SE INICIAM AS LINHAS DE CÓDIGOS ADICIONADAS PARA QUE SEJA EXECUTADA
        // A FUNÇÃO REQUERIDA NO EXERCICIO****

        List<String> segundaLista = new ArrayList<>();

        nomesFemininos.forEach(item -> segundaLista.add(item));

        System.out.println("Segunda lista:" + segundaLista);

        scanner.close();
    }
}