import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LivroFisico livro1 = new LivroFisico("Aventuras em Java", "João Autor");
        Ebook ebook1 = new Ebook("Programação Java Avançada", "João Autor", "PDF");

        Reserva reservaLivro1 = new Reserva(livro1);
        Reserva reservaEbook1 = new Reserva(ebook1);

        while (true) {
            System.out.println("Selecione uma ação:");
            System.out.println("1 - Listar Livros");
            System.out.println("2 - Reservar Livro");
            System.out.println("3 - Reservar Ebook");
            System.out.println("4 - Cancelar Reserva Ebook");
            System.out.println("5 - Emprestar Livro");
            System.out.println("6 - Devolver Livro");
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    listarLivros();
                    break;
                case 2:
                    System.out.print("Digite o número do livro que deseja reservar: ");
                    int livroEscolhido = scanner.nextInt();
                    if (livroEscolhido == 1) {
                        reservaLivro1.reservarLivro();
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 3:
                    reservaEbook1.reservarEbook();
                    break;
                case 4:
                    reservaEbook1.cancelarReservaEbook();
                    break;
                case 5:
                    livro1.emprestar();
                    break;
                case 6:
                    livro1.devolver();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }
    }

    public static void listarLivros() {
        System.out.println("Livros disponíveis:");
        System.out.println("1 - Aventuras em Java (Livro Físico)");
        System.out.println("2 - Programação Java Avançada (Ebook)");
        System.out.println(" ");
    }
}