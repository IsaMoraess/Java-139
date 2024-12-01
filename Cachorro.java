package atvd40;
//SUB-CLASSE
public class Cachorro extends Animal {
    //CONSTRUTOR Q CHAMA O CONSTRUTOR DA SUPERCLASSE
    public Cachorro(String nome, int idade) {
        super(nome, idade, "Caramelo");
    }

    //SOBSCRITA DO METODO FAZER SOM
    @Override
    public void fazerSom() {
        System.out.println("Au Au");
    }
}

