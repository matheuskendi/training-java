import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Saque");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Status de cheque especial");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");
            String op = sc.next();

            double valor = 0;
            double saldo = 0;
            switch (op) {

                case "1":
                    saldo = new ConsultarSaldo().getSaldo();
                    System.out.println("R$" + saldo);
                    break;

                case "2":
                    break;

                case "3":
                    System.out.println("Informa o valor a ser depositado: ");
                    valor = sc.nextDouble();
                    saldo = new ConsultarSaldo().getSaldo();
                    double totalDeposito = valor + saldo;
                    System.out.println("Saldo atual: " + totalDeposito);
                    break;

                case "4":
                    System.out.println("Informa o valor a ser sacado: ");
                    valor = sc.nextDouble();
                    saldo = new ConsultarSaldo().getSaldo();
                    double totalSaque = valor - saldo;
                    System.out.println("Saldo atual: " + totalSaque);
                    break;

                case "5":
                    System.out.println("Informa o valor a ser pago: ");
                    valor = sc.nextDouble();
                    saldo = new ConsultarSaldo().getSaldo();
                    double totalPago = valor - saldo;
                    System.out.println("Saldo atual: " + totalPago);
                    break;

            }

        }
    }
}
