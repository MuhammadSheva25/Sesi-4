import java.util.Scanner;

public class GajiLembur {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Gaji: ");
            double gaji = input.nextDouble();
            
            System.out.print("Jam Lembur: ");
            int jamLembur = input.nextInt();
            
            System.out.print("Upah Lembur: ");
            double upahLembur = input.nextDouble();
            
            double gajiLembur = gaji + (jamLembur * upahLembur);
            
            System.out.println("Gaji yang diterima adalah " + gajiLembur);
        }
    }
}
