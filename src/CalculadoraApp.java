import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while(true) {


            System.out.println("**** Aplicacion Calculadora ****");
            //Se muestra menu
            mostrarmenu();
            try {

                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    //Se ejecuta la operacion consola
                    ejecutarOperacion(operacion,consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto ...");
                    break;
                } else {
                    System.out.println("Opcion erronea " + operacion);
                }

                //Imprimir un salto
                System.out.println();
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());

            } //fin try
        }//fin de while

    }//fin de main

    private static void mostrarmenu(){
        //System.out.println("1. suma \n2.Resta \n3.Multiplicacion \n4.Divicion");

        System.out.println("""
                                        
                    1.Suma
                    2.Resta
                    3.Multiplicacion
                    4.Divicion
                    5.Salir
                                        
                    """);
        System.out.println("Operacion a realizar?");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.println("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        double resultado;

        switch (operacion) {
            case 1:
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
                break;

            case 2:
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicacion : " + resultado);
                break;
            case 4:
                resultado = operando1 / operando2;
                System.out.println("Resultado de la divicion: " + resultado);
                break;
            default:
                System.out.println("Opcion Error: " + operacion);
                break;

        }
        // var resultado = operando1 +operando2;
        // System.out.println("Resultado: " + resultado);
    }
}//fin de clase
