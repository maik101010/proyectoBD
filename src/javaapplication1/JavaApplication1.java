package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author megarcia
 */
public class JavaApplication1 {

    static void addAppend(String s, StringBuffer buffer) {
        s = s + buffer.toString();
        buffer.append(s);
        s = null;
        buffer = null;
        //   System.out.println("s: " + s + " sb: " + buffer);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {2, 3, 2, 9, 5, 2, 1, 1, 4};
        int minlndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minlndex]) {
                minlndex = i;
            }
        }
        System.out.println(array[minlndex]);

//        List<Integer> lista = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            lista.add(i);
//
//        }
//
//        List<Integer> lista2 = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            lista2.add(i);
//
//        }
//
//        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println(lista2.get(i) + " : " + lista.get(j));
//            }
//        }

//        String s = "hola";
//        StringBuffer sb = new StringBuffer("chao");
//        addAppend(s, sb);
//        System.out.println("s: " + s + " sb: "+sb);
//        String arg = "yo voy";
//        boolean esPalindromo = true;
//        int j = arg.length() - 1;
//        for (int i = 0; i < arg.length(); i++) {
//            char letraInicio = arg.charAt(i);
//            char letraFin = arg.charAt(j);
//            j--;
//            if (letraInicio == ' ') {
//                i++;
//                letraInicio = arg.charAt(i);
//                i--;
//            }
//            if (letraFin == ' ') {
//                j++;
//                letraFin = arg.charAt(j);
//                j--;
//            }
//            if (letraFin != letraInicio) {
//                esPalindromo = false;
//                break;
//            }
//        }
//        if (esPalindromo) {
//            System.out.println("Es palindromo");
//        } else {
//            System.out.println("No es palindromo");
//        }
//        int arr[] = new int[]{0,1,2,3,4,5,6,7,8,9};
//        int n = 6;
//        n = arr[arr[n]/2];
//        System.out.println(arr[n]/2);
    }
}
