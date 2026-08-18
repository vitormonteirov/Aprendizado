package Aprendizado.UseTheHeadJAVA.Avulses;

public class GoodDogTestDrive {
    public static void main(String[] args) {

        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Cachorro um: " + one.getSize());
        System.out.println("Cachorro dois: " + two.getSize());

        one.bark();
        two.bark();

        GoodDog[] pets;
        pets = new GoodDog[7];

        pets[0] = new GoodDog();
        pets[1] = new GoodDog();
        pets[3] = new GoodDog();

        pets[0].setName("Snoop");
        pets[0].setIdade(7);

        pets[1].setName("Paçoca");

        System.out.println("Pet de Pedro é: " + pets[1].getName());

        System.out.println("O nome do primeiro cão é " + pets[0].getName() + " e sua idade é "+ pets[0].getIdade() + " anos.");

        pets[3].setName("Eco");
        System.out.println(pets[3].getName());

    }
}
