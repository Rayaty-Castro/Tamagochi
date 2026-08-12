import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tamagotchi tamagotchi = new Tamagotchi();


        tamagotchi.setNome("wakashimazu");
        tamagotchi.setFome(100);
        tamagotchi.setEnergia(100);
        tamagotchi.setHumor();



        System.out.println(tamagotchi.getNome());
        System.out.println(tamagotchi.getFome());
        System.out.println(tamagotchi.getEnergia());
        System.out.println(tamagotchi.getHumor());
    }


}





