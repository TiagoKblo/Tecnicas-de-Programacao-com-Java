import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); //ler do teclado
        System.out.println("Digite um valor inteiro: ");
        int valor = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro valor inteiro: ");
        int outro = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a letra + ou - para operacao:");
        String letra = leitor.nextLine();
        int resultado;
        if(letra.equals("+")){
            resultado = valor + outro;
        }else{
            resultado = valor - outro;
        }
        System.out.println("Resultado da operacao: " + resultado);
        //proxima aula slide 16 da aula 3.
    }
}