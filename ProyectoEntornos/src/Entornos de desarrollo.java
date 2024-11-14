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

        // Imprimir el arreglo con las palabras y el orden invertido
        System.out.println("---------------------");
        ImprArray(darVueltaArr(vueltaPalabras(cadena)));
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

    static String arrRev(String e) {
        
        String aux = ""; // Creamos una variable 'aux' que almacenará los caracteres invertidos del string.
        for (int i = e.length() - 1; i >= 0; i--) {
            aux = aux + e.charAt(i);  // Concatenamos cada carácter de 'e' en orden inverso a 'aux'
        }

        return aux; // devolvemos aux que contiene el string al reves 
    } // metodo que le entra un string y te devuelve el mismo pero del reves 

    static String[] vueltaPalabras(String[] e) {
        String[] aux = new String[e.length]; // creamos un array del mismo tamaño que le entra
        // Recorremos el array  para invertir cada palabra individualmente
        for (int i = 0; i < e.length; i++) {
            aux[i] = arrRev(e[i]);  // Usamos el método arrRev para invertir la palabra en e[i] y asignarla a aux[i]
        }
        return aux; // Devolvemos el arreglo 'aux' con las palabras invertidas
    }

    static String[] darVueltaArr(String[] e) {
        int n = e.length; // creamos una variable del tamaño de e
        String[] reversa = new String[n]; //creamos un array del tamaño de e
        // recorremos el for para colocar los string del reves en el nuevo array 
        for (int i = 0; i < n; i++) {
            reversa[i] = e[n - 1 - i];
        }
        
        return reversa;
    } // invertir disposicion del array

    static void ImprArray(String[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i] + "");
        }
    }

}