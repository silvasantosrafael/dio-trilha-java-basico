import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = input.nextLine();
        System.out.print("Por favor, digite o número da Conta: ");
        numero = input.nextInt();
        input.nextLine();
        System.out.print("Por favor, digite o seu Nome: ");
        nomeCliente = input.nextLine();
        System.out.print("Por favor, digite o Saldo: ");
        saldo = input.nextBigDecimal();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}