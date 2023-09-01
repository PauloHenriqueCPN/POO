public class Transmissao1 implements ITransmiteDados{
    @Override
    public void enviaJson() {
        System.out.println("Enviando .json");
    }
    
    @Override
    public String recebeMensagem(String protocolo) {
        return "recebida mensagem usando protocolo " + protocolo;
    }
}
