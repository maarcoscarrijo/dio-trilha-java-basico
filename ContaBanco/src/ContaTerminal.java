
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner contaCorrente = new Scanner(System.in);

        System.out.println("Por favor, entre com o número da Conta Corrente");
        int conta = contaCorrente.nextInt();

        System.out.println("Por favor, entre com o número da Agência");
        String agencia = contaCorrente.next();

        System.out.println("Digite o nome completo do titular da conta");
        String nome = contaCorrente.next();

        System.out.println("Digite o saldo em conta");
        float saldo = contaCorrente.nextFloat();
        
        System.out.println("Olá " + nome + ", obrigado por criar sua conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia + ", conta " + conta + " e o saldo é R$" + saldo + "!");
        
        contaCorrente.close();
    }
}