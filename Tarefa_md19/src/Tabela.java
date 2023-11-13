import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // Pode ser aplicada a classes
public @interface Tabela {
    String valor() default "tabela semanal"; // Valor padrão "tabela semanal"
}