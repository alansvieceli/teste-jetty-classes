package br.com.alan.modelos;

public class MyClassJetty {
	
	private String nome;
	private Integer idade;
	
	public MyClassJetty(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;		
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getIdadeComAcrescimo() {		
		return this.idade * 1.15;		
	}
}
