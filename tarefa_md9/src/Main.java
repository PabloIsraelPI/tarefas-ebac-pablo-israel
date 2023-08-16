public class Main {
    public static void main(String[] args) {

    // Casting de varialvel primitiva para wrapper.
        long num1 = 8;
        System.out.println(num1);

        Long num2 = num1;
        System.out.println(num2);

    // Casting de variavel com 64 bits para variavel de 32 bits.
        long num3 = 7;
        System.out.println(num3);

        int num4 = (int) num3;
        System.out.println(num3);
    }
}