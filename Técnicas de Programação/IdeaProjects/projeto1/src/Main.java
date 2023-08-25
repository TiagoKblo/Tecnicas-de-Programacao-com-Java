import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato(7, "Ana", "emaildaana");
        Contato contato2 = new Contato(4, "Pedro", "emaildopedro");
        Contato contato3 = new Contato(1, "Maria", "emaildamaria");
        Contato contato4 = new Contato(2, "Pereira", "emaildopereira");
        System.out.println(contato1.equals(contato4)); //retorna false
        System.out.println(contato1.hashCode()); //retorna 3
        System.out.println(contato2.equals(contato1)); //retorna false
        System.out.println(contato3.hashCode()); //retorna 5
        List<Contato> lista = new ArrayList<>();
        lista.add(contato1);
        lista.add(contato2);
        lista.add(contato3);
        lista.add(contato4);
        System.out.println("Digite o id do contato a ser encontrado: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Contato contatoProcurado = new Contato();
        contatoProcurado.setIdContato(id);
        if(lista.contains(contatoProcurado)){
            System.out.println("Existe este contato");
            System.out.println("Dados abaixo");
            contatoProcurado = lista.get(lista.indexOf(contatoProcurado));
            System.out.println(contatoProcurado);
            lista.remove(contatoProcurado);
        }else{
            System.out.println("Nao existe este contato na lista");
        }
        System.out.println();
        System.out.println("Lista atual: ");
        Collections.sort(lista);
        for(Contato c: lista){
            System.out.println(c);
        }
    }
}