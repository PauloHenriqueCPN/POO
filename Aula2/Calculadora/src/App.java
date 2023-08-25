import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String msg;
        double n1;
        double n2;
        double result;

        System.out.println("Informe o primeiro número:");
        n1 = leitor.nextDouble();

        System.out.println("Qual operação você deseja fazer?");
        System.out.println("soma, sub, mult, div");
        msg = leitor.next();

        result = 0;

        while (msg != "sair") {
            switch (msg) {
                case "soma":
                    System.out.println("Informe o segundo número:");
                    n2 = leitor.nextDouble();
                    System.out.println(soma(n1, n2));
                    result = soma(n1, n2);
                    break;
                
                case "sub":
                    System.out.println("Informe o segundo número:");
                    n2 = leitor.nextDouble();
                    System.out.println(sub(n1, n2));
                    result = sub(n1, n2);
                    break;

                case "mult":
                    System.out.println("Informe o segundo número:");
                    n2 = leitor.nextDouble();
                    System.out.println(mult(n1, n2));
                    result = mult(n1, n2);
                    break;

                case "div":
                    System.out.println("Informe o segundo número:");
                    n2 = leitor.nextDouble();
                    System.out.println(div(n1, n2));
                    result = div(n1, n2);
                    break;
                
                default:
                    System.out.println("Operação desconhecida");
                    break;                
                                
            }
         
            System.out.println("Informe se deseja continuar com o resultado, reiniciar ou sair");
            System.out.println("continuar, limpar, sair");            
            msg = leitor.next();
            
            switch (msg) {
                case "continuar":
                n1 = result;
                System.out.println("Qual operação você deseja fazer?");
                System.out.println("soma, sub, mult, div");
                msg = leitor.next();
                break;

                case "limpar":
                System.out.println("Informe o primeiro número:");
                n1 = leitor.nextDouble();
                System.out.println("Qual operação você deseja fazer?");
                System.out.println("soma, sub, mult, div");
                msg = leitor.next();
                break;

                case "sair":
                msg = "sair";
                break;
            }

        }

    }

    public static double soma(double n1, double n2) {
        return n1 + n2;
    }

    public static double sub(double n1, double n2) {
        return n1 - n2;
    }

    public static double mult(double n1, double n2) {
        return n1 * n2;
    }

    public static double div(double n1, double n2) {
        return n1 / n2;
    }

    
}
