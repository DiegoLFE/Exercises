package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

       /* Ejercicio 3:
        Definir e inicializar una nueva lista vacía. Agregar a la lista vacía los siguientes elementos: 1,5,5,6,7,8,8,8.
        Imprimir el resultado por pantalla. */


        List<Integer> unaListaDeEnteros = new ArrayList<>();
        unaListaDeEnteros.add(8);
        unaListaDeEnteros.add(8);
        unaListaDeEnteros.add(1);
        unaListaDeEnteros.add(5);
        unaListaDeEnteros.add(5);
        unaListaDeEnteros.add(6);
        unaListaDeEnteros.add(7);


        System.out.println("Lista " + unaListaDeEnteros);




     /*   Ejercicio 4:
        Definir e inicializar un nuevo conjunto vacío. Agregar al conjunto vacío los siguientes elementos: 1,5,5,6,7,8,8,8.
        Imprimir el resultado por pantalla. ¿Qué diferencia existe con el ejercicio anterior?*/

        Set<Integer> unConjuntoDeEnteros = new HashSet<>();
        unConjuntoDeEnteros.add(8);
        unConjuntoDeEnteros.add(8);
        unConjuntoDeEnteros.add(1);
        unConjuntoDeEnteros.add(5);
        unConjuntoDeEnteros.add(5);
        unConjuntoDeEnteros.add(6);
        unConjuntoDeEnteros.add(7);


        System.out.println("Conjunto " + unConjuntoDeEnteros);


        //RECORRER CON FOR EACH EL CONJUNTO DE ENTEROS
        for(Integer unNumeroEntero : unConjuntoDeEnteros){
            System.out.println(unNumeroEntero);
        }

        //RECORRER CON FOR EACH LA LISTA DE ENTEROS
        Integer sumaTotal = 0;
        for(Integer unNumeroEntero : unaListaDeEnteros){
            sumaTotal = sumaTotal + unNumeroEntero;
        }
        System.out.println("La suma total es: " + sumaTotal);










    }
}
