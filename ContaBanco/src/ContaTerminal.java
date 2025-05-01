import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = sc.nextInt();

        System.out.println("Por favor, digite a Agência !");
        String agencia = sc.next();

        System.out.println("Por favor, digite o seu Nome !");
        //NextLine para limpar o buffer e consumir o ENTER, caso contrario o nextLine entenderia o ENTER como linha vazia
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu Saldo !");
        double saldo = sc.nextDouble();

        System.out.println(STR."Olá \{nomeCliente}, obrigado por criar uma conta em nosso banco, sua agência é \{agencia}, conta \{numeroAgencia} e seu saldo \{saldo} já está disponível para saque");
    }
}