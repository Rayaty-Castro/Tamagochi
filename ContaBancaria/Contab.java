public class Contab {
    private String titular;
    private double saldo = 0;
    private double limite;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
        } else {
            System.out.println("O limite não pode ser negativo.");
        }
    }

    public double getLimite() {
        return limite;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito deve ser maior que 0.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que 0.");
        } else if (valor <= (saldo + limite)) {
            this.saldo -= valor;
            System.out.println("Saldo e limite insuficientes para realizar o saque.");
        } else {
            System.out.println("Saldo e limite insuficientes para realizar o saque.");
        }
    }
}