import java.util.ArrayList;
import java.util.List;

public class Banana extends Frutas {

    public Banana(String tipo, double preco, int quantidade) {
        super("Banana " + tipo, preco, quantidade);
    }

    public static List<Banana> criarEstoque() {
        List<Banana> bananas = new ArrayList<>();
        bananas.add(new Banana("Prata", 6.50, 20));
        bananas.add(new Banana("Nanica", 5.00, 15));
        bananas.add(new Banana("Maçã", 8.00, 10));
        return bananas;
    }

    public boolean comprar(int qtd) {
        if (qtd > 0 && qtd <= getQuantidade()) {
            setQuantidade(getQuantidade() - qtd);
            return true;
        }
        return false;
    }
}