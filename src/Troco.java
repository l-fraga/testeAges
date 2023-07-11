import java.util.Locale;
import java.util.Scanner;

/**
 * Calculadora de troco.
 */
public class Troco {
    /**
     * Calcula a diferença entre o preço do produto e o valor pago.
     *
     * @param precoProduto o preço do produto
     * @param valorPago    o valor pago
     * @return a diferença entre o preço e o valor pago
     */

    public static double calculaDiferenca(double precoProduto, double valorPago) {
        return Math.abs(precoProduto - valorPago);
    }

    /**
     * Calcula o número de notas ou moedas necessárias para dar o troco.
     *
     * @param troco o valor do troco
     * @param valor o valor da nota ou moeda
     * @return o número de notas ou moedas necessárias
     */

    public static int calculaTroco(double troco, double valor) {
        var resultado = (int) (troco / valor);
        if (valor == 1)
            troco -= valor;
        else
            troco %= valor;
        return resultado;

    }

    /**
     * Método principal para executar o programa de cálculo de troco.
     *
     * @param args os argumentos da linha de comando
     */
    
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

            int notasDeDuzentos = calculaTroco(troco, 200);

            int notasDeCem = calculaTroco(troco, 100);

            int notasDeCinquenta = calculaTroco(troco, 50);

            int notasDeVinteECinco = calculaTroco(troco, 25);

            int notasDeDez = calculaTroco(troco, 100);

            int notasDeCinco = calculaTroco(troco, 5);

            int notasDeDois = calculaTroco(troco, 2);

            int moedasDeUmReal = calculaTroco(troco, 1);

            int moedasDeCinquentaCentavos = calculaTroco(troco, 0.50);

            int moedasDeVinteECincoCentavos = calculaTroco(troco, 0.25);

            int moedasDeDezCentavos = calculaTroco(troco, 0.10);

            int moedasDeCincoCentavos = calculaTroco(troco, 0.05);

            int moedasDeUmCentavo = calculaTroco(troco, 0.01);

            System.out.println(notasDeDuzentos + " nota(s) de R$ 200.00");

            System.out.println(notasDeCem + " nota(s) de R$ 100.00");

            System.out.println(notasDeCinquenta + " nota(s) de R$ 50.00");

            System.out.println(notasDeVinteECinco + " nota(s) de R$ 25.00");

            System.out.println(notasDeDez + " nota(s) de R$ 10.00");

            System.out.println(notasDeCinco + " nota(s) de R$ 5.00");

            System.out.println(notasDeDois + " nota(s) de R$ 2.00");

            System.out.println(moedasDeUmReal + " moeda(s) de R$ 1,00");

            System.out.println(moedasDeCinquentaCentavos + " moeda(s) de R$ 0,50");

            System.out.println(moedasDeVinteECincoCentavos + " moeda(s) de R$ 0,25");

            System.out.println(moedasDeDezCentavos + " moeda(s) de R$ 0,10");

            System.out.println(moedasDeCincoCentavos + " moeda(s) de R$ 0,05");

            System.out.println(moedasDeUmCentavo + " moeda(s) de R$ 0,01");

        }
        in.close();
    }
}
