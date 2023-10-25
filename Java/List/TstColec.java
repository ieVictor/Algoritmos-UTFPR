public class TstColec {

	private static final Leitura l = new Leitura();
	private static final GestPes gestao = new GestPes();
	
	public static void main(String[] args) {
		int decision = 0;
		do {
			System.out.println("\n1 - Adicionar nova pessoa");
			System.out.println("2 - Consultar pessoa");
			System.out.println("3 - Remover pessoa");
			System.out.println("4 - Alterar pessoa");
			System.out.println("0 - Sair");
			decision = Integer.parseInt(l.entDados("Escolha: "));

			switch (decision) {
				case 1:
					do {
						Pessoa p1 = new Pessoa();
						p1.setCpf(Integer.parseInt(l.entDados("\nCPF: ")));
						p1.setNome(l.entDados("Nome: "));
						gestao.inserirPes(p1);
						System.out.println("\nPessoa Inserida com sucesso!");
						System.out.println("Inserir nova pessoa? (s/n)");
					}
					while (l.entDados("Escolha: ").equalsIgnoreCase("s"));
					break;

				case 2:
					gestao.consultarPes(Integer.parseInt(l.entDados("\nDigite o CPF da Pessoa: ")));
					break;

				case 3:
					gestao.listarPessoas();
					gestao.deletarPes(Integer.parseInt(l.entDados("\nDigite o CPF a ser removido: ")));
					break;

				case 4:
					gestao.listarPessoas();
					gestao.alterarPes(
							Integer.parseInt(l.entDados("\nDigite o CPF da pessoa a ser alterado: ")),
							l.entDados("Digite o novo nome da pessoa: ")
					);
					break;

				case 0:
					System.out.println("\nSaindo...");
					break;
			}
		}
		while(decision != 0);
	}
}