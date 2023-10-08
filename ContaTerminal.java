import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para cadastrar, digite seu NOME: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a AGÊNCIA: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o NÚMERO DA CONTA: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o SALDO: ");
        double saldo = scanner.nextDouble();


                System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso Banco!");
                System.out.println("Sua AGÊNCIA é: " + agencia);
                System.out.println("CONTA: " + numero + "  seu saldo é: " + saldo + " e já está disponível para saque");

    }

}