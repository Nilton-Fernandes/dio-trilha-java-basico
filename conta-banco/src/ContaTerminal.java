import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       double sado = 237.48;
       System.out.println("Por favor, digite seu nome!");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta!");
       int numeroConta = sc.nextInt();

       System.out.printf("Olá %s. \nobrigado por criar uma conta em nosso banco. ",nomeCliente);
      System.out.printf("\nsua agência é %s, conta %d e seu saldo %.2f. \njá está disponível para saque.",agencia,numeroConta,sado);
    }
}
