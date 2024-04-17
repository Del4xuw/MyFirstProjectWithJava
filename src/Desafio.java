import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner retiros = new Scanner(System.in);
        Scanner depositos = new Scanner(System.in);
        String nombre = "Tony Satrk";
        String tipoDeCuenta = "Corriente";
        double saldo = 20000;
        double retiro = retiros.nextDouble() - saldo;
        double deposito = depositos.nextDouble()+saldo;
        System.out.println("********************");
        System.out.println("Nombre del cliente:" + nombre);
        System.out.println("*Tipo de cuenta:"+ tipoDeCuenta);
        System.out.println("Escriba el numero de la opcione que desea");
        System.out.println("1 - Consular Saldo =" + saldo);
        System.out.println("2 - Retirar:" + retiro);
        System.out.println("2 - Depositar:" + deposito);
    }
}
