import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Digite a sua idade: ");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();

        try {
            if (idade < 0 || idade == 0 || idade > 100) {
                throw new Exception();
            } else {
                System.out.println("Olá, você tem " + idade + " anos de idade!");
            }

        } catch (Exception e) {
            throw new InputMismatchException("Não foi possível determinar sua idade!");
        }
    }
}