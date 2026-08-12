public class Persona {
    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    public Persona(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.energia = 100;
        this.nivel = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }
    public void receberDano(int dano) {
        if (dano > 0) {
            this.vida -= dano;
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
    }

    public void descansar(int quantidade) {
        if (getStatus().equals("Derrotado")) {
            System.out.println(nome + " está derrotado e não pode descansar.");
            return;
        }
        this.energia += quantidade;
        if (this.energia > 100) {
            this.energia = 100;
        }
    }

    public void atacar(int custoEnergia) {
        if (getStatus().equals("Derrotado")) {
            System.out.println(nome + " está derrotado e não pode atacar.");
            return;
        }

        if (this.energia >= custoEnergia) {
            this.energia -= custoEnergia;
            System.out.println(nome + " realizou um ataque!");
        } else {
            System.out.println(nome + " não tem energia suficiente para atacar!");
        }
    }

    public String getStatus() {
        if (this.vida == 0) {
            return "Derrotado";
        }
        return "Vivo";
    }
}