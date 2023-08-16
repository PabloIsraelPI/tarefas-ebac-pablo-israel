public class Main {
    public static void main(String[] args) {

        int trabalho1 = 9;
        int trabalho2 = 3;
        int trabalho3 = 3;
        int trabalho4 = 3;

        int somaDasNotas = trabalho1 + trabalho2 + trabalho3 + trabalho4;

        int mediaDasNotas = somaDasNotas / 4;

        System.out.println("A média das notas é:" + mediaDasNotas);
        
        if (mediaDasNotas >= 7) {
            System.out.println("Aprovado com nota:" + mediaDasNotas);
        } else if (mediaDasNotas >= 5) {
            System.out.println("De recuperação com nota:" + mediaDasNotas);
        } else if (mediaDasNotas <5) {
            System.out.println("Reprovado com nota:" + mediaDasNotas);

        }
    }
}