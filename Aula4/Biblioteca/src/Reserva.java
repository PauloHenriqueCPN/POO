public class Reserva {
    private LivroFisico livro;
    private Ebook ebook;

    public Reserva(LivroFisico livro) {
        this.livro = livro;
    }

    public Reserva(Ebook ebook) {
        this.ebook = ebook;
    }

    public void reservarLivro() {
        if (livro != null) {
            livro.reservar();
        } else {
            System.out.println("Este item não é um livro físico.");
        }
    }

    public void reservarEbook() {
        if (ebook != null) {
            ebook.reservar();
        } else {
            System.out.println("Este item não é um e-book.");
        }
    }
    
    public void cancelarReservaEbook() {
        if (ebook != null) {
            ebook.cancelarReserva();
        } else {
            System.out.println("Este item não é um e-book.");
        }
    }
}