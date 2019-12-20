package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author megarcia
 */
public class JavaApplication11 {

    public static boolean isUnique(String caracteres) {
        Set<Character> lista = new HashSet<>();
        boolean resultado = true;
        for (int i = 0; i < caracteres.length(); i++) {
            if (!lista.add(caracteres.charAt(i))) {
                resultado = false;
            }
        }
        return resultado;
    }

    public static boolean permutation(String cadena1, String cadena2) {
        HashMap<Character, Integer> hash = new HashMap<>();
        boolean resultado = true;
        for (int i = 0; i < cadena1.length(); i++) {
            hash.put(cadena1.charAt(i), i);
        }
        for (int i = 0; i < cadena2.length(); i++) {
            if (!hash.containsKey(cadena2.charAt(i))) {
                resultado = false;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        String caracter = "abc";
        String caracter2 = "cba";
        System.out.println(permutation(caracter, caracter2));

    }
}
