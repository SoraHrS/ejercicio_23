import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a,b,c,discriminante,solucion1,solucion2, solucionu;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Ingrese el valor de A: ");
        a = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        b = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        c = scanner.nextDouble();

        discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante > 0) {
            solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + solucion1 + ", x2 = " + solucion2);
        } else if (discriminante == 0) {
            solucionu = -b / (2 * a);
            System.out.println("La solución única es: x = " + solucionu);
        } else {
            System.out.println("La ecuación no tiene soluciones en los reales");
        }
    }
}