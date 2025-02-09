import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String NomeCliente = "Bruno";
        Double Saldo = 22.92;

        System.out.println("Digite o numero da sua conta");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o a agência");
        String Agencia = scanner.nextLine();


        System.out.printf("Olá " +NomeCliente + "\n Saldo: " +" R$ "+ Saldo + "\n Conta: " + numero + "\n Agencia: " + Agencia );


        scanner.close();


    }
}

