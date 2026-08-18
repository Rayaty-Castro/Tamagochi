public class Main {
    static void main(){

        Tamagochi tamagochi = new Tamagochi("Rayaty");
        IO.println(tamagochi.getHumor());
        tamagochi.setFome(20);
        tamagochi.setEnergia(80);
        IO.println(tamagochi.getHumor());
    }
}