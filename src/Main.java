public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5, "Labrador");
        Animal gato = new Gato("Mia", 3);

        cachorro.emitirSom();
        gato.emitirSom();

        cachorro.dormir();
        gato.dormir();

        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Raça do cachorro: " + ((Cachorro)cachorro).getRaca());
    }
}
