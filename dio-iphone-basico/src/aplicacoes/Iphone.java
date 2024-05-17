package aplicacoes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("(iphone)Ligando para o número: " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("(iphone) Atendendo o número: " + numero);
    }

    @Override
    public void iniciarCorreioDeVoz(String numero) {
        System.out.println("(iphone) Mandando um correio de voz para o número: " + numero);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("(browser)Acessando página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("(iphone) Nova aba aberta: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("(iphone) Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música pelo iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada pelo iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música pelo iphone");
    }
}
