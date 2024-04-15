public class JogoTestDrive {
    public static void main(String[] args) {
        InimigoFactory factory = new InimigoFactory();
        Inimigo inimigo = null;

        inimigo = factory.criarInimigo("Amazonia");

        inimigo.atacar();

        inimigo = factory.criarInimigo("Rio de Janeiro");

        inimigo.atacar();

        inimigo = factory.criarInimigo("Sertao");

        inimigo.atacar();
    }
}