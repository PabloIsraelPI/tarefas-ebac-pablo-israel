import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        // Obtenha a classe usando Reflection
        Class<?> classe = ClasseComaAnotacao.class;

            // Obtenha a anotação da classe
            Tabela anotacao = classe.getAnnotation(Tabela.class);

            // Acesse o valor do elemento 'valor' da anotação
            String valorDaAnotacao = anotacao.valor();
            System.out.println("Valor da anotação: " + valorDaAnotacao);
        }
    }
