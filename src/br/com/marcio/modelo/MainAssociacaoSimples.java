package br.com.marcio.modelo;

/*
 * A associação é uma das formas mais simples de relacionamento entre classes 
 * e ocorre quando existe uma classe que possui um atributo de outra classe
 * objetos ou array de objetos ).
 *
 * Este tipo de relacionamento também é conhecido por relacionamento ?tem um(a)?.
 *	
 * Por exemplo, quando uma associação entre a classe ?Pessoa? e a classe ?Endereco?, 
 * diz que uma pessoa ?tem um? endereço.
 */

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
