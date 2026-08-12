import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Contab conta = new Contab();

    // Leitura dos dados iniciais da conta
    System.out.print("Digite o nome do titular: ");
    String titular = scanner.nextLine();
    conta.setTitular(titular);

    System.out.print("Digite o valor do limite: R$ ");
    double limite = scanner.nextDouble();
    conta.setLimite(limite);

    // Exibição dos dados iniciais
    System.out.println("\n--- Dados da Conta ---");
    System.out.println("Titular: " + conta.getTitular());
    System.out.println("Saldo Inicial: R$ " + conta.getSaldo());
    System.out.println("Limite: R$ " + conta.getLimite());

    // Testando Depósito
    System.out.println("\n--- Depósito ---");
    System.out.print("Digite o valor para depósito: R$ ");
    double valorDeposito = scanner.nextDouble();
    conta.depositar(valorDeposito);
    System.out.println("Saldo atual: R$ " + conta.getSaldo());

    // Testando Saques
    System.out.println("\n--- Saque 1 ---");
    System.out.print("Digite o valor do primeiro saque: R$ ");
    double valorSaque1 = scanner.nextDouble();
    conta.sacar(valorSaque1);
    System.out.println("Saldo atual: R$ " + conta.getSaldo());

    System.out.println("\n--- Saque 2 ---");
    System.out.print("Digite o valor do segundo saque: R$ ");
    double valorSaque2 = scanner.nextDouble();
    conta.sacar(valorSaque2);
    System.out.println("Saldo atual: R$ " + conta.getSaldo());

    scanner.close();
  }
}