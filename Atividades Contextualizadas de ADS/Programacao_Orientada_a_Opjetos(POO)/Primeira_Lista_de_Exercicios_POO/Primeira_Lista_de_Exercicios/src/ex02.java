import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        /*Exercício 2
        Exercício sequencial
        Construa o código para um problema no qual é preciso ler dois números
        inteiros e calcular a sua soma. Escreve ao fim o valor dos dois números e da
        soma.
         */

        Integer number1 = null;
        Integer number2 = null;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o Primeiro Numero: ");
        number1 = leitor.nextInt();

        System.out.println("Informe o Segundo Numero: ");
        number2 = leitor.nextInt();

        int soma = number1 + number2;

        System.out.println("A Soma entre os Numeros informados são: " + soma);
    }
}
