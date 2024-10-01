/*Carlos Johan Navarro Delgado 192343 */

import java.util.Scanner;
public class contar_numeros_pares {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        final int VALOR_PAR = 2;

        System.out.println("Escriba un numero positivo");
        int num_Entero = scanner.nextInt();
        int comprobra_Par = 0;
        int cuenta = 0;

        System.out.print("(");
        for (int i = 1; i <= num_Entero; i++){

            comprobra_Par = i % VALOR_PAR;
            if(comprobra_Par != 0){
                cuenta += 1;
                System.out.print(i + ", ");
            }
        }
        System.out.print(")");
        System.out.print(" total: " + cuenta);
    }
}