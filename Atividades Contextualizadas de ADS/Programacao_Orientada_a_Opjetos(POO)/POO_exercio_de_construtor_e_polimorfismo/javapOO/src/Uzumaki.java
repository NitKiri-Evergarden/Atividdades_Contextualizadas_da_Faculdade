public class Uzumaki extends nija {

    public Uzumaki(String nome, String aldeia, int idade, String sexo) {
        super(nome, aldeia, idade, sexo);
    }

    public void AtiveiChakra() {


        if (idade == 17) {
            System.out.println(" Eu sou" + nome + "e eu ativei o Chakra");
        }
        else
            System.out.println(" Eu sou" + nome + "e ainda não possuo  Chakra");

    }

}
