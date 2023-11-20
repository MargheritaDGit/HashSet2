public class Animale {
    String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animale{" +
                "nome=" + nome + '\'' +
                '}';
    }
}
