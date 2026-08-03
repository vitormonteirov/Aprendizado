package Aprendizado.DSjava.Chapter1;

public class CreditCard {
    // Variaveis de Instancia
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;
    // Construtor
    public CreditCard(String no, String nm, String bk, Double bal, int lim) {
        number = no;
        name = nm;
        bank = bk;
        balance = bal;
        limit = lim;
    }
    // Metodos de Aceso
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public Double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public boolean chargeIt(double price){ //debita
        if(price + balance > (double)limit)
            return false; // Não há dinheiro suficiente
        balance += price;
        return true; // Neste caso, Debito efetivado
    }
    public void makePayment(double payment){
        balance -= payment;
    }
    public static void printCard(CreditCard c){
        System.out.println("Card Number: " + c.getNumber());
        System.out.println("Name: " + c.getName());
        System.out.println("Bank: " + c.getBank());
        System.out.println("Balance: " + c.getBalance());
        System.out.println("Limit: " + c.getLimit());
    }
}
