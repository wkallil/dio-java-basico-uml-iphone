package interfaces;

public interface NavegadorInternet {
    default void exibirPagina(String url) {
        System.out.println("(browser)Acessando página: " + url);
    }
    default void adicionarNovaAba(String url) {
        System.out.println("(browser) Nova aba aberta: " + url);
    }
    default void atualizarPagina(){
        System.out.println("(browser) Página atualizada");
    }
}
