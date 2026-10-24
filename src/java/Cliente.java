import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;

    // G & S
    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
         return nome; 
        }

    
    public static List<Cliente> preCadastro() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Rui"));
        clientes.add(new Cliente("Gabriely"));
        clientes.add(new Cliente("Júlio"));
        return clientes;
    }
}