package controllers;

import javax.swing.JOptionPane;

import entities.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {

	public void cadastrarPessoa() {

		try {

			Pessoa pessoa = new Pessoa();

			pessoa.setNome(JOptionPane.showInputDialog("ENTRE COM O NOME: "));

			pessoa.setEmail(JOptionPane.showInputDialog("ENTRE COM O EMAIL:"));
			
			PessoaRepository pessoaRepository = new PessoaRepository();

			pessoaRepository.save(pessoa);

			JOptionPane.showMessageDialog(null, "PESSOA CADASTRADO COM SUCESSO!");
		} catch (Exception e) {

			System.out.println("\nFALHA AO CADASTRAR PESSOA.");
			e.printStackTrace();
		}
	}
}
