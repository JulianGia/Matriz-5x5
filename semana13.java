import java.util.Scanner;
public class semana13 {
    public static double calcularPrecio(double nota1,double nota2){
        Scanner leer = new Scanner(System.in);
        double promedio = (nota1 + nota2) / 2;
        return promedio;
    }
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Escriba su nota del parcial 1: ");
        int nota1 = leer.nextInt();
        System.out.print("Escriba su nota del parcial 2: ");
        int nota2 = leer.nextInt();
        double promedio = calcularPrecio(nota1, nota2);

        System.out.println(promedio);


}
}