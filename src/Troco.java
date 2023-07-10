
import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) throws Exception {
        Locale brLocale = new Locale("pt", "BR");
        Scanner in = new Scanner(System.in);

        int qtt200;
        int qtt100;
        int qtt50;
        int qtt25;
        int qtt10;
        int qtt5;
        int qtt2;

        double qtt005;
        double qtt010;
        double qtt025;
        double qtt050;
        double qtt1;

        System.out.println("Digite o preço do produto: ");
        double precoProduto = in.nextDouble();

        System.out.println("Digite o valor pago: ");
        double valorPago = in.nextDouble();

        double troco = calculaDiferenca(precoProduto, valorPago);

        if (troco < 0) {
            System.out.println("O valor pago não é suficiente.");
        } else if (troco == 0) {
            System.out.println("O valor pago não é suficiente.");

        }

    }

    public int separaInteiro(double valorPago) {
        int valorInteiro = (int) valorPago;
        return valorInteiro;
    }

    public double separaDecimal(double valorPago) {
        double valorDecimal = valorPago % 1;
        return valorDecimal;
    }

    public static double calculaDiferenca(double precoProduto, double valorPago) {
        return Math.abs(precoProduto - valorPago);
    }
}
