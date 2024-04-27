import java.util.Scanner;
 // Randall Steven Arguello Zeledon 2024-1377U

 //MayorSuma  Sesion 16
 //Escriba un programa que solicite al usuario ingresar tres numeros enteros diferentes y muestre
 //por pantalla la suma de los dos mas pequeños, la diferencia de los dos mas grandes y cual de los
 // tres numeros es el mayor.
public class App {

    public static int num1;
    public static int num2;
    public static int num3;
    public static int SumarDosMasPequeños;
    public static int RestarDosMayores;
    public static int NumeroMayor;

    public static int SumarDosMasPequeños(int num1, int num2, int num3) {

        int sumaMenores = num1 + num2 + num3 - Math.max(Math.max(num1, num2), num3);
        // calcular la suma de los dos numeros mas pequeños
        return sumaMenores;
     }

    public static int RestarDosMayores(int num1, int num2, int num3) {

        int diferenciaMayores = Math.max(Math.max(num1, num2), num3) - Math.max(Math.min(num1, num2), num3);
        // Calcular la diferencia de los dos números mayores
        return diferenciaMayores;
     }

     public static int NumeroMayor (int num1, int num2, int num3) {

        int mayor = Math.max(Math.max(num1, num2), num3); // obtener el numero mayor 
        return mayor;
         }

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
                // llamar a los metodos
                int sumaMenores = SumarDosMasPequeños (num1, num2,num3);

                System.out.println(" La suma de los dos numeros mas pequeños es: " + sumaMenores);

                int diferenciaMayores = RestarDosMayores (num1, num2,num3);
                System.out.println(" La diferencia de los dos numeros mayores es: " + diferenciaMayores);

                int mayor = NumeroMayor (num1, num2,num3);
                System.out.println(" El numero mayor es:" + mayor);

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();

            }
            
        } while (num1 == num2 || num1 == num3 || num2 == num3);
          

      leer.close();
    }
}
