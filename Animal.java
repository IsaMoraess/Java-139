package atvd40;
/*Exercício 3: Sistema de Gerenciamento de Animais (Herança)
Objetivo: Criar uma hierarquia de classes para diferentes tipos de animais.
                                    Passos:
1.Defina a classe Animal com atributos private String nome e private int idade, 
e um método public void fazerSom().
2.Crie subclasses Cachorro e Gato que herdam de Animal.
3.Sobreponha o método fazerSom() em Cachorro para retornar "Au Au" 
e em Gato para retornar "Miau".
4.Adicione um método public void info() em Animal para exibir informações.
5.Teste as classes no método main, criando instâncias de Cachorro e Gato. */

//SUPER-CLASSE
public class Animal {
    //ATRIBUTOS
    private String nome;
    private int idade;
    private String pelo;

    //CONSTRUTOR
    public Animal(String nome, int idade, String pelo) {
        this.nome = nome;
        this.idade = idade;
        this.pelo = pelo;
    }

    //METODO FAZER SOM (sobrescrito nas subclasses)
    public void fazerSom() {
        System.out.println("O animal está fazendo um som");
    }

    //METODO INFO (exibir informações)
    public void info() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    //METODO PELAGEM
    public void pelo(){
        System.out.println("Pelo: " + pelo);
    }
}
