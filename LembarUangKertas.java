import java.util.Scanner;

public class LembarUangKertas {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nominal: ");
            int nominal = input.nextInt();
            
            int[] uangKertas = {50000, 20000, 10000, 5000, 2000, 1000};
            int[] jumlahLembar = new int[6];
            
            for (int i = 0; i < uangKertas.length; i++) {
                jumlahLembar[i] = nominal / uangKertas[i];
                nominal %= uangKertas[i];
            }
            
            System.out.println("Lembar uang kertas yang diperlukan:");
            for (int i = 0; i < uangKertas.length; i++) {
                if (jumlahLembar[i] > 0) {
                    System.out.println(jumlahLembar[i] + " lembar " + uangKertas[i] + " ribuan");
                }
            }
            if (nominal > 0) {
                System.out.println(nominal + " keping 500an");
            }
        }
    }
}
