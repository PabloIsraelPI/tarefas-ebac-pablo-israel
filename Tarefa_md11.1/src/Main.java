import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por virgula, sem espaços:");
        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        ArrayList<String> listaNomes = new ArrayList<>();

        Collections.addAll(listaNomes, nomes);

       // System.out.println(listaNomes);

        // Crie um Comparator que ignora diferenças de maiúsculas/minúsculas
        Comparator<String> ignoreCaseComparator = String.CASE_INSENSITIVE_ORDER;

        Collections.sort(listaNomes, ignoreCaseComparator);

        System.out.println(listaNomes);
        scanner.close();
    }
}

