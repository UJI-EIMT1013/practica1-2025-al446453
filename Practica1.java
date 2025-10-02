package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        List<Integer> lista = new ArrayList<>();
        while (it.hasNext()) {
            lista.add(it.next());
        }
        Set<Integer> resultado = new HashSet<>();
        for (int i = 0; i<lista.size(); i++) {
            int a = lista.get(i);
            if (a == 0) continue;
            for (int j = 0; j < lista.size(); j++) {
                if (i == j) continue;
                int b = lista.get(i);
                if (b == 0) continue;
                if (a % b == 0) {
                    resultado.add(a);
                }
            }
        }
        return resultado;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        //TODO

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
