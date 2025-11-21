import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
       /* Exercício 3
        Exercício sequencial
        Construa o código para um problema no qual é preciso ler três notas de um
        aluno, calcule a média final deste aluno, em seguida exiba as notas e a média.
                Considerar que a média é aritmética.
        */

        Integer note1 = null;
        Integer note2 = null;
        Integer note3 = null;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Infomer A primeira nota do Aluno: ");
        note1 = leitor.nextInt();

        System.out.println("Informe Segundo: ");
        note2 = leitor.nextInt();

        System.out.println("Agora Informe A Terceira Nota: ");
        note3 = leitor.nextInt();

        int calculo_da_media = (note1 + note2 + note3) / 3;

        System.out.printf("As Notas do Aluno São %s, %s e %s, E sua mendia é: %s \n", note1, note2, note3, calculo_da_media);
        //System.out.println(calculo_da_media);
    }
}
