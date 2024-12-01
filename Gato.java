package atvd40;
//SUB-CLASSE
public class Gato extends Animal {
    //CONSTRUTOR Q CHAMA O CONSTRUTOR DA SUPERCLASSE
    public Gato(String nome, int idade) {
        super(nome, idade, "Preto");
    }

    //SOBSCRITA DO METODO FAZER SOM
    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }
}
