package entities;

public class BankAccount {
    private String name;
    private double amount;
    private int number;

    // Construtor principal
    public BankAccount(String name, int number){
        this.name = name;
        this.number = number;
    }

    //Construtor sobrecarregado caso queira permitir um depósito inicial
    public BankAccount(String name, int number, double initialDeposit){
        this.name = name;
        this.number = number;
        depositAmount(initialDeposit);
    }

    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public void depositAmount(double amount){
        this.amount += amount;
    }

    // Deduz o valor do saque mais uma taxa fixa de $5.00
    public void withdrawAmount(double amount){
        this.amount -= (amount + 5.0);
    }

    public int getNumber(){
        return number;
    }

    public double getAmount(){
        return amount;
    }

    public String toString(){
        return "\nAccount data\n"
                + "Account: " + number
                + ", Holder: " + name
                + String.format(", Balance: $ %.2f", amount)
                + "\n";
    }
}
