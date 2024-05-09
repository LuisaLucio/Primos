package principal;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int cantidadElementos = sc.nextInt();

        GeneradorPrimos generadorPrimos = new GeneradorPrimos();
        List<Integer> listaPrimos = new ArrayList<>();

        for (int i = 0; i < cantidadElementos; i++) {
            int primo = generadorPrimos.generarPrimoAleatorio();
            listaPrimos.add(primo);
        }
        intercambiarPosicion3y6(listaPrimos);
        intercambiarPosicion5y10(listaPrimos);

        System.out.println("Lista de primos final:");
        for (Integer primo : listaPrimos) {
            System.out.print(primo + " ");
        }
    }

    private static void intercambiarPosicion3y6(List<Integer> lista) {
        int temp = lista.get(2);
        lista.set(2, lista.get(5));
        lista.set(5, temp);
    }

    private static void intercambiarPosicion5y10(List<Integer> lista) {
        int temp = lista.get(4);
        lista.set(4, lista.get(9));
        lista.set(9, temp);
    }
}

