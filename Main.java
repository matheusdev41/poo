public class Main {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 42, 2 );
        Produto mouse = new Produto("Mouse", 10, 10);
        System.out.println("PRODUTOS");
        teclado.exibirInfo();
        mouse.exibirInfo();

        teclado.adicionarEstoque(2, "Teclado");
        mouse.removerEstoque(2);

        System.out.println("\nEstoque Atualizado:");
        System.out.println("PRODUTOS");
        System.out.println("-----------------------");
        teclado.exibirInfo();
        mouse.exibirInfo();
    }
}