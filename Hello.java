import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome);


    }
}
