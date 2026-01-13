package Aprendizado.testegpt;

public class Main {

    public static void main(String[] args) {
        Husky h = new Husky();
        h.setName("Lobo");
        h.setSize(45);
        h.setCorPelagem("Branca e cinza");

        System.out.println("Nome: " + h.getName());
        System.out.println("Pelagem: " + h.getCorPelagem());


        h.bark();       // herdado de GoodDog
        h.puxarTreno(); // método próprio de Husky
    }
}
