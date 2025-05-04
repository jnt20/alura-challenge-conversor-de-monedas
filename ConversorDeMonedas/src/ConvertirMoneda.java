import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir (String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;


        Monedas monedas = consulta.buscarMonedas(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión para hoy es \n "
                +monedaBase+ " = " +monedas.conversion_rate()+" " +monedaTarget);
        System.out.println("Ingresa la cantidad: " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+ " " +monedaBase + " = "+cantidadConvertida + " " +monedas.target_code());
    }
    public static void convertirOtraMoneda (ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingresa el código de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingresa la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);


    }
}
