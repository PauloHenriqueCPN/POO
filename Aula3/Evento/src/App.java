import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String cadastro; 
        String nomeEvent, dataEvent, localEvent, infoEvent, maxEvent;
        String nomeP;

        System.out.println("Escolha o que deseja fazer:");
        System.out.println("Cadastrar evento(ce), Casdastra pessoa(cp)");
        cadastro = leitor.next();

        switch (cadastro) {
            case "ce":
                System.out.println("Informe o nome do evento:");
                nomeEvent = leitor.next();
                System.out.println("Informe a data do evento:");
                dataEvent = leitor.next();
                System.out.println("Qual o local desejado:");
                localEvent = leitor.next();
                System.out.println("Qual o número máximo de participantes:");
                maxEvent = leitor.next();
                System.out.println("Cite uma informação adicional deste evento:");
                infoEvent = leitor.next();
                break;

            case "cp":
                System.out.println("Informe o nome da pessoa:");
                nomeP = leitor.next();
                break;
        }
    }
}
