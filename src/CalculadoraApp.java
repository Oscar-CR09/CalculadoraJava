import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("**** Aplicacion Calculadora ****");
        //Se muestra menu
        //System.out.println("1. suma \n2.Resta \n3.Multiplicacion \n4.Divicion");

        System.out.println("""
                
                1.Suma
                2.Resta
                3.Multiplicacion
                4.Divicion
                5.Salir
                
                """);
        System.out.println("Operacion a realizar?");
        var operacion = Integer.parseInt(consola.nextLine());
        //Revisar que este dentro de las opciones mencionadas
        if(operacion >= 1 && operacion <=4){
            System.out.println("Proporciona valor operando1: ");
            var operando1 =Integer.parseInt(consola.nextLine());
            System.out.println("Proporciona valor operando2: ");
            var operando2 = Integer.parseInt(consola.nextLine());

            int resultado;

            switch (operacion){
                case 1:
                    resultado = operando1 + operando2;
                    System.out.println("Resultado de la suma: " +resultado);
                    break;

                case 2:
                    resultado = operando1 - operando2;
                    System.out.println("Resultado de la resta: "  +resultado);
                    break;
                case 3:
                    resultado = operando1 * operando2;
                    System.out.println("Resultado de la multiplicacion : " + resultado);
                    break;
                case 4 :
                    resultado = operando1 / operando2;
                    System.out.println("Resultado de la divicion: " +resultado);
                    break;
                default:
                    System.out.println("Opcion Error: " + operacion);
                    break;

            }
           // var resultado = operando1 +operando2;
           // System.out.println("Resultado: " + resultado);
        } else if (operacion == 5 ) {
            System.out.println("Hasta pronto ...");
        }else {
            System.out.println("Opcion erronea " + operacion);
        }


    }
}
