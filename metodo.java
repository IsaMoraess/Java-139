package atvd40;

public class metodo {
    public static void main(String[] args) {
        //INSTANCIAS DE CACHORRO E GATO
        Cachorro cachorro = new Cachorro("Pandora", 4);
        Gato gato = new Gato("Deadpool", 3);

        //MOSTRANDO INFORMAÇÕES E SONS
        System.out.println("-----Cachorro-----");
        cachorro.info();
        cachorro.pelo();
        cachorro.fazerSom();

        System.out.println("\n-----Gato-----");
        gato.info();
        gato.pelo();
        gato.fazerSom();
    }
}
