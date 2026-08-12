public class Cofrinho {
    private String nome;
    private double saldo = 0;
    private double meta;

    public Cofrinho(String nome, double meta) {
        this.nome = nome;
        this.meta = meta;
        this.saldo = 0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getMeta() {
        return meta;
    }
    public void setMeta(double meta) {
        this.meta = meta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarDinheiro(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("O valor adicionado deve ser positivo.");
        }
    }
    public void retirarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("O valor retirado deve ser positivo.");
        } else if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar a retirada.");
        }
    }
    public double getProgresso() {
        if (meta <= 0) {
            return 0;
        }
        return (saldo / meta) * 100;
    }
    public String getStatus() {
        if (saldo == 0) {
            return "Meta não iniciada";
        } else if (saldo < meta) {
            return "Economizando";
        } else {
            return "Meta alcançada";
        }
    }
}