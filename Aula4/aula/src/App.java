public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1;
        Jogador j1 = new Jogador("def", "c2", "Flamengo", "unif1", 10);

        System.out.println(j1.posX);
        j1.movimenta(10, -5);
        System.out.println(j1.posX + ", " + j1.posY);

        // Downcasting
        p1 = new Jogador("gh1", "c3", "Fluminense", "unif2", 6);
        j1.falar();
    }
}
