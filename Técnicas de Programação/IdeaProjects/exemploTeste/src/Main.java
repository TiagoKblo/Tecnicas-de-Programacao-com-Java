import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            int a, b, c;
            Scanner sc= new Scanner(System.in);
            System.out.println("Digite o Valor de a: ");
            a = sc.nextInt();
            System.out.println("Digite o Valor de b: ");
            b = sc.nextInt();
            c= a/b;
            System.out.println("Divisão inteira é: " + c);
        }catch(InputMismatchException exception){
        System.out.println("Entrada inválida esperado um número inteiro");
        }catch (ArithmeticException exception){
        System.out.println("Impossível divisão por zero");
        }catch (Exception exception){
        System.out.println("Erro inesperado: " + exception.getMessage());
            }
        finally {
            System.out.println("Sou teimoso. Executo mesmo");
        }

    }
}