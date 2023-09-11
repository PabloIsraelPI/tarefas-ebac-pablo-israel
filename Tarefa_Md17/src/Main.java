import java.util.ArrayList;
import java.util.List;

public class Main {
    // Lista com os objetos que representam os modelos de carros.
    public static void main(String[] args) {
        List<Carro> listaDeCarros = new ArrayList<>();

        Honda hondaCivic = new Honda("Duas portas", 2020);
        Hyundai hyundaiElantra = new Hyundai("Quatro portas", 2023);
        Fiat fiatPalio = new Fiat("Elétrico", 2022);

        listaDeCarros.add(hondaCivic);
        listaDeCarros.add(hyundaiElantra);
        listaDeCarros.add(fiatPalio);

    //Loop para impressão de todos os objetos no console.
        for (Carro carro : listaDeCarros) {
            System.out.println(carro);
        }
    }
}