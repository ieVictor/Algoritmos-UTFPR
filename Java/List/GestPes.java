import java.util.ArrayList;
import java.util.List;

public class GestPes {

    private Pessoa p1;
    private List<Pessoa> list = new ArrayList<>();

    public void inserirPes(Pessoa pessoa) {
        list.add(pessoa);
    }

    public void consultarPes(int cpf) {
        if(list.isEmpty()) {
            System.out.println("\nAinda nao ha pessoas cadastradas");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if (cpf == list.get(i).getCpf()) {
                System.out.println("\nCPF: " + list.get(i).getCpf());
                System.out.println("Nome: " + list.get(i).getNome());
                System.out.println("Endereco: " + i);
                return;
            }
        }

        System.out.println("\nCPF nao encontrado!");
    }

    public void alterarPes(int cpf, String nome) {
        if(list.isEmpty()) {
            System.out.println("\nAinda nao ha pessoas cadastradas");
            return;
        }

        for (Pessoa pessoa : list) {
            if (cpf == pessoa.getCpf()) {
                pessoa.setNome(nome);
            }
            else System.out.println("\nCPF nao encontrado");
        }
    }

    public void deletarPes(int cpf) {
        list.removeIf(pessoa -> cpf == pessoa.getCpf());
    }

    public void listarPessoas() {
        if (list.isEmpty()) {
            System.out.println("\nAinda nao ha pessoas cadastradas");
            return;
        }

        for (Pessoa pessoa : list) {
            System.out.println("\nCPF: " + pessoa.getCpf());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Endereco: " + list.indexOf(pessoa));
            System.out.println("\n");
        }
    }
}
