public class Painel {
    String nome;
    String evento;
    String email;
    String vaga;

    Painel(String nome, String evento) {
        this.nome = nome;
        this.evento = evento;
    }
    
    Painel(String nome, String evento, String email) {
        this.nome = nome;
        this.evento = evento;
        this.email = email;
    }
}