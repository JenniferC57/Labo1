//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Bienvenidos a la calculadora-----");
        int opcion;
        Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Elige la operacion que deseas realizar:");
                System.out.printf("1- sumar %n2- Restar %n3- Multiplicar %n4- Dividir %n5- Salir %n");
                System.out.print("Opcion: ");
                opcion = sc.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("Ingresa el primer numero a sumar:");
                        int numS1 = sc.nextInt();
                        System.out.println("Ingresa el segundo numero a sumar:");
                        int numS2 = sc.nextInt();

                        System.out.print("El resultado de la suma es: ");
                        System.out.println(sumar(numS1, numS2));
                        break;
                    case 2:
                        System.out.println("Ingresa el primer numero a restar:");
                        int numR1 = sc.nextInt();
                        System.out.println("Ingresa el segundo numero a restar:");
                        int numR2 = sc.nextInt();

                        System.out.print("El resultado de la resta es: ");
                        System.out.println(restar(numR1, numR2));
                        break;
                    case 3:
                        System.out.println("Ingresa el primer numero a multiplicar:");
                        int numM1 = sc.nextInt();
                        System.out.println("Ingresa el segundo numero a multiplicar:");
                        int numM2 = sc.nextInt();

                        System.out.print("El resultado de la multiplicacion es: ");
                        System.out.println(multiplicar(numM1, numM2));
                        break;
                    case 4:
                        System.out.println("Ingresa el primer numero a dividir:");
                        int numD1 = sc.nextInt();
                        System.out.println("Ingresa el segundo numero a dividir:");
                        int numD2 = sc.nextInt();

                        System.out.print("El resultado de la division es: ");
                        System.out.println(dividir(numD1, numD2));
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opcion no existe");
                        break;
                }
            }while(opcion != 5);



    }
    //Suma
    public static int sumar(int numS1, int numS2){
        return numS1 + numS2;
    }

    //Resta
    public static int restar(int numR1, int numR2){
        return numR1 - numR2;
    }

    //Multiplicacion
    public static int multiplicar(int numM1, int numM2){
        return numM1 * numM2;
    }

    //Division
    public static int dividir(int numD1, int numD2){
        return numD1 / numD2;
    }
}