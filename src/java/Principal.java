import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Cliente> clientes = Cliente.preCadastro();
        List<Banana> bananas = Banana.criarEstoque();

        System.out.println("=== CLIENTES CADASTRADOS ===");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + " - " + clientes.get(i).getNome());
        }
        System.out.print("Quem está comprando? (apenas número)");
        int c = scanner.nextInt();

        if (c < 1 || c > clientes.size()) {
            System.out.println("Esse cliente não está cadastrado");
            scanner.close();
            return;
        }
        Cliente cliente = clientes.get(c - 1);

        System.out.println("\n=== BANANAS DISPONÍVEIS ===");
        for (int i = 0; i < bananas.size(); i++) {
            Banana b = bananas.get(i);
            System.out.println((i + 1) + " - " + b.getNome()
                    + " | R$ " + b.getPreco() + " | estoque: " + b.getQuantidade());
        }
        System.out.print("Escolha a banana: ");
        int b = scanner.nextInt();

        if (b < 1 || b > bananas.size()) {
            System.out.println("Banana indisponivel.");
            scanner.close();
            return;
        }
        Banana banana = bananas.get(b - 1);

        System.out.print("Quantidade: ");
        int qtd = scanner.nextInt();

        if (banana.comprar(qtd)) {
            System.out.println("\n" + cliente.getNome() + " comprou " + qtd + " x "
                    + banana.getNome() + " | Total: R$ " + (qtd * banana.getPreco()));
        } else {
            System.out.println("\nEstoque insuficiente ou quantidade inválida.");
        }

        scanner.close();
    }
}