import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /*    double[] notas = { 3.9, 6.9, 8.9, 8.1, 10};
        //tamanho

        System.out.println(notas.length);

        //terceira nota
        System.out.println(notas[2]);

        //todas as notas
        //percorrer o vetor
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota: " + (i+1) + " => " +  notas[i]);
        }

        int x[] = new int[10];
        Arrays.fill(x, 15);
        for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }
        */
        List<Integer> numeros = new ArrayList<>();
        numeros.add(53);
        numeros.add(23);
        numeros.add(1);
        numeros.add(59);
        numeros.add(7);
        numeros.add(2);
        Collections.sort(numeros);
        for(Integer numero : numeros){
            System.out.println(numero);
        }



    }
}