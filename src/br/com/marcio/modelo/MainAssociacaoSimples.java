package br.com.marcio.modelo;

public class MainAssociacaoSimples {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Marcio Marques Dias",24);
		
		Endereco endereco = new Endereco("Rua Qualquer","Bairro Qualquer","Cidade Qualquer");
		
		pessoa.setEndereco(endereco);
		
		System.out.println(pessoa.getEndereco().getRua());
		System.out.println(pessoa.getEndereco().getBairro());
		System.out.println(pessoa.getEndereco().getCidade());
		
	}

}
