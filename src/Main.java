import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1 - Consultar Saldo \n " +
                "2 - Consultar Cheque Especial \n " +
                "3 - Depositar dinheiro \n " +
                "4 - Saque \n" +
                "5 - Pagar Boleto \n" +
                "6 - Status de cheque especial \n" +
                "7 - Sair");





        double saldo = new ConsultarSaldo ().getSaldo();




    }

}
