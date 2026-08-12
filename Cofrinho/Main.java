public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho("Viagem", 500.0);

        IO.println("Nome: " + cofrinho.getNome());
        IO.println("Saldo Inicial: " + cofrinho.getSaldo());
        IO.println("Status Inicial: " + cofrinho.getStatus());
        IO.println("Progresso Inicial: " + cofrinho.getProgresso() + "%");

        IO.println("\n--- Adicionando R$ 200,00 ---");
        cofrinho.adicionarDinheiro(200.0);
        IO.println("Saldo: " + cofrinho.getSaldo());
        IO.println("Status: " + cofrinho.getStatus());
        IO.println("Progresso: " + cofrinho.getProgresso() + "%");

        IO.println("\n--- Adicionando R$ 300,00 ---");
        cofrinho.adicionarDinheiro(300.0);
        IO.println("Saldo: " + cofrinho.getSaldo());
        IO.println("Status: " + cofrinho.getStatus());
        IO.println("Progresso: " + cofrinho.getProgresso() + "%");

        IO.println("\n--- Retirando R$ 100,00 ---");
        cofrinho.retirarDinheiro(100.0);
        IO.println("Saldo: " + cofrinho.getSaldo());
        IO.println("Status: " + cofrinho.getStatus());
        IO.println("Progresso: " + cofrinho.getProgresso() + "%");
    }
}