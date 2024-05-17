package interfaces;

public interface AparelhoTelefonico {
    default void ligar(String numero) {
        System.out.println("(telefone)Ligando para o número: " + numero);
    }
    default void atender(String numero) {
        System.out.println("(telefone) Atendendo o número: " + numero);
    }
    default void iniciarCorreioDeVoz(String numero){
        System.out.println("(telefone) Mandando um correio de voz para o número: " + numero);
    }

}
