package Aprendizado.UseTheHeadJAVA;

public class GoodDog {

    private int size;
    private String name;
    private int idade;

    public String getName()
    {
        return name;

    }
    public int getIdade() {
        return idade;

    }
    public void setName(String name) {
        this.name = name;

    }
    public void setIdade(int idade) {
        this.idade = idade;

    }
    public int getSize() {
        return size;

    }
    public void setSize(int s){
        size = s;

    }
    void bark(){
        if (size > 60){
            System.out.println("Wooof! Wooof!");
        }
        else if (size > 14) {
            System.out.println("Ruff! Ruuf!");
        }
        else {
            System.out.println("Yip! Yip!");
        }
    }
}
