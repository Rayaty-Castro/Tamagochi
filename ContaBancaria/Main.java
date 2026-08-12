public class Main {
  public static void main(String[] args) {
    Contab conta = new Contab();

    conta.setTitular("Rayaty");
    conta.setLimite(700.0);

    System.out.println("Titular: " + conta.getTitular());
    System.out.println("Saldo Inicial: R$ " + conta.getSaldo());
    System.out.println("Limite: R$ " + conta.getLimite());

    System.out.println("\n Testando Depósito ");
    conta.depositar(200.0);
    System.out.println("Saldo atual: R$ " + conta.getSaldo());

    System.out.println("\n Testando Saque dentro do Saldo ");
    conta.sacar(50.0);
    System.out.println("Saldo atual: R$ " + conta.getSaldo());

    System.out.println("\n Testando Saque usando o Limite ");
    conta.sacar(300.0);
    System.out.println("Saldo atual: R$ " + conta.getSaldo());

    System.out.println("\n Testando Saque com Saldo/Limite Insuficientes ");
    conta.sacar(1000.0);
  }
}