public class Main {
    public static void main(String[] args) {

        // Criando um objeto iPhone
        iPhone meuIphone = new iPhone();

        // Testando funções do Reprodutor Musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("----------------------------");

        // Testando funções do Aparelho Telefônico
        meuIphone.ligar("51 99999-8888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("----------------------------");

        // Testando funções do Navegador Internet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
