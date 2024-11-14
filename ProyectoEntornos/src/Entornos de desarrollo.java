Entornos de desarroll
public class EjEx1 {

    public static void main(String[] args) {

        //Te pasan un String con "palabras" separadas por ',', un Array de palabras, imprimirla, darle la vuelta al array y a los String del array
        String s1 = "arbol,casa,pelota,playa,telefono";
        String s2 = ",";
        System.out.println(s1);
        imprimirResultado(s1, s2);

    }

    static void imprimirResultado(String s1, String s2) {
        // Separar las palabras usando mySplit
        String[] cadena = mySplit(s1, s2);

        // Imprimir el arreglo original
        System.out.println("---------------------");
        ImprArray(cadena);

        
    }

    static String[] mySplit(String e, String a) {
        int ind_aux = 0;
// primero hacemos un for para contar la cantidad de limitadores hay 
        for (int i = 0; i < e.length(); i++) {
            if (e.charAt(i) == a.charAt(0)) { // si encontamos un delimitador
                ind_aux++;                    // aumentamos en contador
            }

        }
        // creamos un array para guardar las palabras 
        String arrayString[];
        arrayString = new String[ind_aux + 1]; // el numero de sub string sera el del contador +1 
        // inicial el array con las cajas vacias
        for (int i = 0; i <= ind_aux; i++) {
            arrayString[i] = ""; // iniciamos todas las posiciones del array pero sin nada dentro 
        }
        ind_aux = 0; // reset indice auxiliar 
        // recorremos el string y vamos llenando el array con las palabras separadas por el delimitador
        for (int i = 0; i < e.length(); i++) {
            if (e.charAt(i) != a.charAt(0)) {  // si no encontramos delimitador
                arrayString[ind_aux] = arrayString[ind_aux] + e.charAt(i); // agregamos el caracter a la caja del array actual

            } else {
                ind_aux++; // si encontamos delimitador pasamos al siguiente caracter y a otra caja para empezar con la siguiente palabra
            }

        }
        return arrayString; // pasamos de un String a un array de Strings
    } // este metodo separa un string en un array usando un delimitador

   // invertir disposicion del array

    static void ImprArray(String[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i] + "");
        }
    }

}