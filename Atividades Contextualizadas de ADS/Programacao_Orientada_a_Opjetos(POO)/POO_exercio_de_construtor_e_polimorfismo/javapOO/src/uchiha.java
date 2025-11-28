public class uchiha extends nija {

    public uchiha(String nome, String aldeia, int idade, String sexo) {
        super(nome, aldeia, idade, sexo);
    }

    public void ativeiSharingan() {


        if (idade == 90) {
            System.out.println(" Eu sou" + nome + "e eu ativei o Sharingan");
        }
        else
            System.out.println(" Eu sou" + nome + "e ainda não possuo  Sharingan");

    }


}
