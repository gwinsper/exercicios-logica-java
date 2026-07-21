package application;
import java.util.Scanner;
import java.util.Locale;
import entities.BankAccount;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        // Loop de validação para garantir que o usuário digite apenas 'y' ou 'n'
        char dw;
        while (true) {
            System.out.print("Is there an initial deposit (y/n)? ");
            dw = sc.next().toLowerCase().charAt(0);

            if (dw == 'y' || dw == 'n') {
                break;
            }
            System.out.println("Invalid response! Please type 'y' or 'n'.");
        }

        BankAccount BA;
        if (dw == 'y') {
            System.out.print("Enter initial deposit value: $ ");
            double initialDeposit = sc.nextDouble();
            BA = new BankAccount(name, number, initialDeposit);
        } else {
            BA = new BankAccount(name, number);
        }

        System.out.println(BA);

        // Operação de Depósito
        System.out.print("Enter a deposit value: $ ");
        double depositValue = sc.nextDouble();
        BA.depositAmount(depositValue);
        System.out.println("Updated account data:");
        System.out.println(BA);

        // Operação de Saque
        System.out.print("Enter a withdraw value: $ ");
        double withdrawValue = sc.nextDouble();
        BA.withdrawAmount(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(BA);

        sc.close();
    }
}