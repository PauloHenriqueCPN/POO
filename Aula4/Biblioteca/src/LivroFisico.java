public class LivroFisico {
    private String titulo;
    private String autor;
    private boolean reservado;
    private boolean emprestado;

    public LivroFisico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.reservado = false;
        this.emprestado = false;
    }

    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("O livro '" + titulo + "' foi reservado com sucesso.");
        } else {
            System.out.println("O livro '" + titulo + "' já está reservado.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("A reserva do livro '" + titulo + "' foi cancelada.");
        } else {
            System.out.println("O livro '" + titulo + "' não estava reservado.");
        }
    }

    public void emprestar() {
        if (reservado && !emprestado) {
            emprestado = true;
            System.out.println("O livro '" + titulo + "' foi emprestado com sucesso.");
        } else if (!reservado) {
            System.out.println("O livro '" + titulo + "' precisa ser reservado primeiro.");
        } else {
            System.out.println("O livro '" + titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + titulo + "' não estava emprestado.");
        }
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}