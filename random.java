import java.util.Random;
import java.util.Scanner; 

public class random {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(10) + 1; // número entre 1 y 10
        int intento;

        System.out.println("=== Adivina el número ===");
        System.out.println("He pensado un número entre 1 y 10. ¡Intenta adivinarlo!");

        do {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();

            if (intento < secreto) {
                System.out.println("Demasiado bajo.");
            } else if (intento > secreto) {
                System.out.println("Demasiado alto.");
            } else {
                System.out.println("¡Correcto! El número era " + secreto);
            }
        } while (intento != secreto);

        sc.close();
}
}