public class Tamagotchi {
    private String nome;
    private int fome;
    private int energia;
    private int humor;

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return nome;
    }

    public void setFome(int fome){
        if(fome >= 100){
            this.fome = 100;
        } else if(fome <= 0){
            this.fome = 0;
        } else {
            this.fome = fome;
        }
    }

    public int getFome(){
        if (fome == 100){
            System.out.print("Saciado! fome: ");
        } else if (fome == 0) {
            System.out.print("Faminto! fome: ");
        } else {
            System.out.print("Fome: ");
        }
        return fome;
    }
    public void setEnergia(int energia){
        if(energia >= 100){
            this.energia = 100;
        } else if(fome <= 0){
            this.fome = 0;
        } else {
            this.fome = fome;
        }
    }

    public int getEnergia(){
        if (energia == 0){
            System.out.print("Esgotado! energia: ");
        } else if (energia == 100) {
            System.out.print("Energizado! energia: ");
        } else {
            System.out.print("Energia: ");
        }
        return energia;
    }

    public void setHumor(){
        int saciedade = 100 - fome;
        humor = (saciedade + energia) / 2;

    }

    public int getHumor(){
        if (humor == 0){
            System.out.print("Estressado! humor: ");
        } else if (humor == 100) {
            System.out.print("Satisfeito! humor: ");
        } else {
            System.out.print("Humor: ");
        }
        return humor;
    }


}


