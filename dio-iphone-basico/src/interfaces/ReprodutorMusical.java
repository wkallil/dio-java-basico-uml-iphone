package interfaces;

public interface ReprodutorMusical {
    default void tocar() {
        System.out.println("Tocando música pelo Reprodutor Musical");
    }

    default void pausar() {
        System.out.println("Música pausada pelo Reprodutor Musical");
    }
    default void selecionarMusica(){
        System.out.println("Selecionando música pelo Reprodutor Musical");
    }
}
