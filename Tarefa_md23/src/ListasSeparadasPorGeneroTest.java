import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;

public class ListasSeparadasPorGeneroTest {
    // Declare uma variável para a instância da classe a ser testada.
    private ListasSeparadasPorGenero programa;

    // Anote o método setUp com @Before para criar uma instância da classe antes de cada teste.
    @Before
    public void setUp() {
        programa = new ListasSeparadasPorGenero();
    }

    // Crie um teste que verifica se todos os nomes femininos são femininos.
    @Test
    public void testNomesFemininosSaoFemininos() {
        List<String> nomesFemininos = programa.nomesFemininos;

        for (String nome : nomesFemininos) {
            // Divida o nome em duas partes usando " - " como separador.
            String[] partes = nome.split(" - ");

            // Verifique se o nome segue o padrão "Nome - F" e é, portanto, feminino.
            assertTrue("Nome feminino: " + nome, partes.length == 2 && partes[1].equalsIgnoreCase("F"));
        }
    }
}
