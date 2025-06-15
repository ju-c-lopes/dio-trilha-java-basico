package ContaTerminal;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta!\n");
        var conta = scanner.nextInt();
        System.out.println("Agora, por favor, digite sua agência!");
        var agencia = scanner.next();
        System.out.println("Digite seu nome: ");
        var cliente = scanner.next();
        System.out.println("Por fim, qual será o depósito inicial?");
        var saldo = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta n° %s e seu saldo de R$ %s já está disponível para saque.", cliente, agencia, conta, saldo);
    }
}
