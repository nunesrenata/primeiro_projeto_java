package principal;

import controllers.PessoaController;

public class Program {

	public static void main(String[] args) {

		PessoaController pessoaController = new PessoaController();
		pessoaController.cadastrarPessoa();
		
	}
}
