import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agClient = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int agNumberClient = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String agNameClient = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double agBalanceClient = scanner.nextDouble();

        System.out.println("Olá " + agNameClient + ", obrigado por criar uma conta em nosso banco, sua agência é " + agClient + ", conta " + agNumberClient + " e seu saldo " + agBalanceClient + " já está disponível para saque.");

        scanner.close();

    }
}