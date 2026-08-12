public class Main {
    public static void main(String[] args) {
        Persona personagem = new Persona("Aroudo");

        IO.println("Status Inicial");
        IO.println("Nome: " + personagem.getNome());
        IO.println("Nível: " + personagem.getNivel());
        IO.println("Vida: " + personagem.getVida());
        IO.println("Energia: " + personagem.getEnergia());
        IO.println("Status: " + personagem.getStatus());

        IO.println("\n Ataque e Descanso ");
        personagem.atacar(40);
        IO.println("Energia após ataque: " + personagem.getEnergia());

        personagem.descansar(20);
        IO.println("Energia após descanso: " + personagem.getEnergia());

        personagem.descansar(100);
        IO.println("Energia limite máximo: " + personagem.getEnergia());

        IO.println("\n Dano e Derrota ");
        personagem.receberDano(60);
        IO.println("Vida após dano: " + personagem.getVida());
        IO.println("Status: " + personagem.getStatus());

        personagem.receberDano(50);
        IO.println("Vida após dano fatal: " + personagem.getVida());
        IO.println("Status final: " + personagem.getStatus());


        personagem.atacar(10);
    }
}