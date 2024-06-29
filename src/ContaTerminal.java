import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String NomeCliente;
        double saldo;

        Scanner obj = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        NomeCliente = obj.nextLine();

        System.out.println("Digite o número da agencia: ");

        agencia = obj.nextLine();

        System.out.println("Digite o número da conta: ");

        numero = Integer.parseInt(obj.nextLine());

        System.out.println("Digite o valor para seu saldo: ");

        saldo = Integer.parseInt(obj.nextLine());

        System.out.println("Olá " + NomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
