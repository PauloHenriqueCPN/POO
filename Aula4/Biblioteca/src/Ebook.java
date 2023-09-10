public class Ebook extends LivroFisico {
    private String formato;

    public Ebook(String titulo, String autor, String formato) {
        super(titulo, autor);
        this.formato = formato;
    }

    @Override
    public void reservar() {
        if (!isReservado()) {
            setReservado(true);
            System.out.println("O e-book '" + getTitulo() + "' foi reservado com sucesso.");
        } else {
            System.out.println("O e-book '" + getTitulo() + "' já está reservado.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (isReservado()) {
            setReservado(false);
            System.out.println("A reserva do e-book '" + getTitulo() + "' foi cancelada.");
        } else {
            System.out.println("O e-book '" + getTitulo() + "' não estava reservado.");
        }
    }

    public String getFormato() {
        return formato;
    }
}