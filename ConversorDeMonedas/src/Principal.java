import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new  ConsultarMoneda();

        int opcion = 0;
        while (opcion != 10){
            System.out.println("***************\n" +
                    "Bienvenido al conversor de monedas\n\n" +
                    "Qué conversión deseas realizar hoy \n\n" +
                    "1. Dólar a Peso Argentino\n" +
                    "2. Peso Argentino a Dólar\n" +
                    "3. Dólar a Real Brasilero\n" +
                    "4. Real Brasilero a Dólar\n" +
                    "5. Dólar a Peso Colombiano \n" +
                    "6. Peso Colombiano a Dólar \n" +
                    "7. Dólar a Sol Peruano\n" +
                    "8. Sol Peruano a Dólar \n" +
                    "9. Convertir a otras monedas\n" +
                    "10. Salir");

            if (lectura.hasNextInt()) {
                opcion = lectura.nextInt();
                lectura.nextLine();
            } else {
                System.out.println("Por favor ingresa un número válido.");
                lectura.nextLine();
                continue;
            }

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;

                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;

                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;

                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;

                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;

                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;

                case 7:
                    ConvertirMoneda.convertir("USD", "PEN", consulta, lectura);
                    break;

                case 8:
                    ConvertirMoneda.convertir("PEN", "USD", consulta, lectura);
                    break;

                case 9:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;

                case 10:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }

        lectura.close();

    }
}

