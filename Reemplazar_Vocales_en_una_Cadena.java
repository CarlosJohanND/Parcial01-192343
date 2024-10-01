import java.util.Scanner;
public class Reemplazar_Vocales_en_una_Cadena {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un de texto");
        String cadena_Texto = scanner.nextLine();
        int cadena_Largo = cadena_Texto.length();
        char [] array_Cadena_Texto = cadena_Texto.toCharArray();

        for (int i = 0; i < cadena_Largo; i++){

            if (array_Cadena_Texto[i] == 'a' || array_Cadena_Texto[i] == 'e' || array_Cadena_Texto[i] == 'i' || array_Cadena_Texto[i] == 'o' || array_Cadena_Texto[i] == 'u'
                || array_Cadena_Texto[i] == 'A' || array_Cadena_Texto[i] == 'E' || array_Cadena_Texto[i] == 'I' || array_Cadena_Texto[i] == 'O' || array_Cadena_Texto[i] == 'U'){

                array_Cadena_Texto[i] = '*';

            }
        }
        String cadena_Texto_Final = String.valueOf(array_Cadena_Texto);
        System.out.println("Valor sin vocales");
        System.out.println(cadena_Texto_Final);

    }
}
