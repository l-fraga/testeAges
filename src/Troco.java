
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) throws Exception {
        Locale brLocale = new Locale("pt", "BR");
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double precoProduto = in.nextDouble();

        System.out.println("Digite o valor pago: ");
        double valorPago = in.nextDouble();

        double troco = calculaDiferenca(precoProduto, valorPago);

        if (troco < 0) {
            System.out.println("O valor pago não é suficiente.");
        } else if (troco == 0) {
            System.out.println("Não há troco a ser dado");
        } else {
            System.out.println("O troco é de R$: " + troco);

            int notasDeDuzentos = (int) (troco / 200);
            troco %= 100;

            int notasDeCem = (int) (troco / 100);
            troco %= 100;

            int notasDeCinquenta = (int) (troco / 50);
            troco %= 50;

            int notasDeVinteCinco = (int) (troco / 25);
            troco %= 25;

            int notasDeDez = (int) (troco / 10);
            troco %= 10;

            int notasDeCinco = (int) (troco / 5);
            troco %= 5;

            int notasDeDois = (int) (troco / 2);
            troco %= 2;

            int moedasDeUmReal = (int) (troco);
            troco -= (int) (troco);

            int moedasDeCinquentaCentavos = (int) (troco / 0.50);
            troco %= 0.50;

            int moedasDeVinteECincoCentavos = (int) (troco / 0.25);
            troco %= 0.25;

            int moedasDeDezCentavos = (int) (troco / 0.10);
            troco %= 0.10;

            int moedasDeCincoCentavos = (int) (troco / 0.05);
            troco %= 0.05;

            int moedasDeUmCentavo = (int) (troco / 0.01);

            System.out.println(" + nota(s) de R$ 100.00");

            System.out.println(" + nota(s) de R$ 50.00");

            System.out.println(" + nota(s) de R$ 25.00");

            System.out.println(" + nota(s) de R$ 10.00");

            System.out.println(" + nota(s) de R$ 5.00");

            System.out.println(" + nota(s) de R$ 2.00");

            System.out.println("+ moeda(s) de R$ 1,00");

            System.out.println("+ moeda(s) de R$ 0,50");

            System.out.println("+ moeda(s) de R$ 0,25");

            System.out.println("+ moeda(s) de R$ 0,10");

            System.out.println("+ moeda(s) de R$ 0,05");

            System.out.println("+ moeda(s) de R$ 0,01");

        }

    }

    public static double calculaDiferenca(double precoProduto, double valorPago) {
        return Math.abs(precoProduto - valorPago);
    }

    public static int calculaTroco(double troco, double valor) {
        var resultado = (int) (troco / valor);
        if (valor == 1)
            troco -= valor;
        else
            troco %= valor;
        return resultado;

    }

}
