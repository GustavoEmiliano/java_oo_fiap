package br.com.fiap.banco;

public class Executavel {
	public static void main(String []args) {
		
		// instancias
		Conta contaEmerson = new Conta();
		contaEmerson.nomeCliente = "Emerson";
		Conta contaDri = new Conta();
		contaDri.nomeCliente = "Adriane";
		
		// simulacoes
		contaEmerson.depositar(10000);
		contaDri.depositar(10000);
		
		contaEmerson.sacar(5000);
		contaDri.sacar(2000);
		
		contaEmerson.exibirSaldo();
		contaDri.exibirSaldo();
		
		contaEmerson.transferir(4000, contaDri);
		contaEmerson.transferir(100, contaDri);

		
	}
}
