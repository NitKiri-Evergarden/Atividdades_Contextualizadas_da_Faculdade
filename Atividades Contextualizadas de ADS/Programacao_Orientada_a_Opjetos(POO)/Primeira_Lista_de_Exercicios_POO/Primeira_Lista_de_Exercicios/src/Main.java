

public class Main {
    public static void main(String[] args) {

        /*Exercício 1
        Exercício sequencial

        Crie uma lista com 2 variáveis reais, 2 variáveis inteiras e 2 variáveis de string.
                Após, atribua valores a todas elas. Em seguida, exiba os valores com a frase
“A variável ??? tem o valor ???”.
● Int quantidade_de_bananas;
● quantidade_de_bananas = 2;
● “A variável quantidade de bananas tem o valor 2”
         */

        int quantidade_de_bananas;
        double preco, temperatura = 70.6;
        int altura, codigo = 5;
        String janela, porta = "Porta";
         janela = "Janela";
        preco = 47.6;
        altura = 45;
        quantidade_de_bananas = 2;

        System.out.printf("As variáves: 'Janela' e 'Porta' tem o valor: %s, %s. As variáves: 'Altura' e 'Temperatura', possui os seguintes valores: %s, %s. já as variáves: 'Altura' e 'Codigo' Tem os Seguintes Valores: %s e %s  \n", janela, porta, preco, temperatura, altura, codigo);
        System.out.print("A variável quantidade de bananas tem o valor: " + quantidade_de_bananas);
    }
}