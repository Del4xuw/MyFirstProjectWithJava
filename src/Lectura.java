import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de un usuario");
        String nombre = teclado.nextLine();
        System.out.println("Escribe el apellido de un usuario");
        String Apellido = teclado.nextLine();
        System.out.println("El nombre es:"+nombre + "y el apellido es:"+Apellido);

    }
}
