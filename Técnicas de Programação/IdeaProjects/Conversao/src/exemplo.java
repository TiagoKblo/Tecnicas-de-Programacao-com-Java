import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner leitor = leitor = new Scanner(System.in); //ler do teclado
        System.out.println("Digite um valor inteiro: ");
        int valor = leitor.nextInt();
        System.out.println("Digite outro valor inteiro: ");
        int outro = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a letra + ou - para operaçao: ");
        String letra = leitor.nextLine();
        int resultado;
        if(letra.equals("+")){
            resultado = valor + outro;
        }else{
            resultado = valor - outro;
        }
    }
}
