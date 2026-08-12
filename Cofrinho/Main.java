import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome e da meta do cofrinho
        System.out.print("Digite o nome do cofrinho (ex: Viagem): ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor da meta: R$ ");
        double meta = scanner.nextDouble();

        // Criação do objeto Cofrinho com os valores informados
        Cofrinho cofrinho = new Cofrinho(nome, meta);

        // Exibição do estado inicial
        IO.println("\n--- Dados Iniciais ---");
        IO.println("Nome: " + cofrinho.getNome());
        IO.println("Saldo Inicial: R$ " + cofrinho.getSaldo());
        IO.println("Status Inicial: " + cofrinho.getStatus());
        IO.println("Progresso Inicial: " + cofrinho.getProgresso() + "%");

        // Adicionando dinheiro pela 1ª vez
        System.out.print("\nDigite o valor a ser adicionado (1º depósito): R$ ");
        double primeiroAdicional = scanner.nextDouble();
        cofrinho.adicionarDinheiro(primeiroAdicional);
        IO.println("Saldo: R$ " + cofrinho.getSaldo());
        IO.println("Status: " + cofrinho.getStatus());
        IO.println("Progresso: " + cofrinho.getProgresso() + "%");

        // Adicionando dinheiro pela 2ª vez
        System.out.print("\nDigite o valor a ser adicionado (2º depósito): R$ ");
        double segundoAdicional = scanner.nextDouble();
        cofrinho.adicionarDinheiro(segundoAdicional);
        IO.println("Saldo: R$ " + cofrinho.getSaldo());
        IO.println("Status: " + cofrinho.getStatus());
        IO.println("Progresso: " + cofrinho.getProgresso() + "%");

        // Retirando dinheiro
        System.out.print("\nDigite o valor a ser retirado: R$ ");
        double valorRetirada = scanner.nextDouble();
        cofrinho.retirarDinheiro(valorRetirada);
        IO.println("Saldo: R$ " + cofrinho.getSaldo());
        IO.println("Status: " + cofrinho.getStatus());
        IO.println("Progresso: " + cofrinho.getProgresso() + "%");

        scanner.close();
    }
}