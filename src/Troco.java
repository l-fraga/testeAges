
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) throws Exception {
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

    }

    public int separaInteiro(double valorPago) {
        int valorInteiro = (int) valorPago;
        return valorInteiro;
    }

    public double separaDecimal(double valorPago) {
        double valorDecimal = valorPago % 1;
        return valorDecimal;
    }
}
