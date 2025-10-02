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
        Set<Integer> union = new HashSet<>(cuadrados);
        union.addAll(noCuadrados);

        Set<Integer> nuevosCuadrados = new HashSet<>();
        Set<Integer> nuevosNoCuadrados = new HashSet<>();

        for (Integer x : union) {
            boolean esCuadrado = false;
            for (Integer y : union) {
                if (y * y == x) {
                    esCuadrado = true;
                    break;
                }
            }
            if (esCuadrado) {
                nuevosCuadrados.add(x);
            } else {
                nuevosNoCuadrados.add(x);
            }
        }
        cuadrados.clear();
        cuadrados.addAll(nuevosCuadrados);
        noCuadrados.clear();
        noCuadrados.addAll(nuevosNoCuadrados);
    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        List<T> lista = new ArrayList<>();
        while (it.hasNext()) {
            lista.add(it.next());
        }
        List<Set<T>> resultado = new ArrayList<>();

        for (T elem : lista) {
            boolean colocado = false;
            for (Set<T> conjunto : resultado) {
                if (!conjunto.contains(elem)) {
                    colocado = true;
                    break;
                }
            }
            if (!colocado) {
                Set<T> nuevo = new HashSet<>();
                nuevo.add(elem);
                resultado.add(nuevo);
            }
        }
        return resultado;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
