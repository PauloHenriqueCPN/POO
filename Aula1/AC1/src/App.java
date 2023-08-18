public class App {        

    public static void main(String[] args) throws Exception{
        primeiro(8,5,6);
        segundo('n');
        terceiro(18);
        quarto(3);
        quinto(2004);
    }
    
    public static void primeiro(double a, double b, double c) {

        System.out.println((a + b) * 0.4 + (c * 0.2));
        System.out.println("--------------------");

    }   

    public static void segundo(int n) {
        n = 150;

        while (n < 201) {
            System.out.print(n++);
            System.out.print(" ");
        }

        System.out.println("--------------------");
        
    }

    public static void terceiro(int num) {
        System.out.println();
        boolean ePrimo = true;
        String divisores = "";
    
        if (num <= 1) {
            ePrimo = false;
        } else {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    ePrimo = false;
                    divisores += i + " ";
                }
            }
        }
    
        if (ePrimo) {
            System.out.println(num + " é um número primo.");
        } else {
            if (!divisores.isEmpty()) {
                System.out.println(num + " não é um número primo. Ele é divisível por: " + divisores);
            } else {
                System.out.println(num + " não é um número primo.");
            }
        }

        System.out.println("--------------------");
    }
    
    
    
    public static void quarto(int num) {

        switch (num) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("--------------------");

    }

    public static void quinto(int ano) {

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println("O ano é bissexto");

        }

        else {
            System.out.println("O ano não é bissexto");

        }        
    }

}
