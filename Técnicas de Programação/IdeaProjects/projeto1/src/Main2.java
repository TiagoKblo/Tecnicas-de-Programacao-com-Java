import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Mariana");
        lista.add(157);
        lista.add(158.989);
        lista.add("Mariana");
        lista.add(System.currentTimeMillis());
        //tamanho
        System.out.println("Tamanho: " + lista.size());
        for(Object objeto : lista){
            System.out.println(objeto);
        }
        int cont = 0;
        while(lista.contains("Mariana")){
            lista.remove("Mariana");
            cont++;
        }
        System.out.println("Iterei: " + cont + " vezes ");
        for(Object objeto : lista){
            System.out.println(objeto);
        }
    }
}