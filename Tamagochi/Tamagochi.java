public class Tamagochi {
    public int energia;
    public int fome;
    public String nome;
    public String humor;

    public Tamagochi(String nome) {
        this.nome = nome;
        energia = 50;
        fome = 50;
        humor = "normal";
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFome() {
        return fome;
    }

    public String getHumor() {
        if (energia > 75 && fome < 25) {
            return humor = "Feliz e sem fome";
        } else if (energia >= 50 && fome <= 50) {
            return humor = "ok e meio cheio";
        } else if (energia >= 25 && fome <= 75) {
            return humor = "Irritado e como fome";
        } else {
            return humor = "faminto e triste";
        }
    }
    public void setFome(int fome){
        if (fome >= 0 && fome <= 100);
    }
    public void setEnergia(int energia){
        if (energia >= 0 && energia <= 100);
    }
}