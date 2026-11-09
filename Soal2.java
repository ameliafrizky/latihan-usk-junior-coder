import java.util.Scanner;
import java.text.DecimalFormat;

public class Soal2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DecimalFormat format = new DecimalFormat("#,##0");

        System.out.print("Harga Barang (Rp) : Rp. ");
        double hargaBarang = input.nextDouble();

        System.out.print("Diskon (%)        : ");
        double diskonPersen = input.nextDouble();

        double diskonRp = hargaBarang * diskonPersen / 100;
        double total = hargaBarang - diskonRp;

        System.out.printf("Diskon            : %.0f%%%n", diskonPersen);
        System.out.println("Diskon (Rp.)      : Rp. " + format.format(diskonRp));
        System.out.println("Total Harga       : Rp. " + format.format(total));

        input.close();
    }
}
