package br.com.fiap.banco;

import java.util.Scanner;

public class Conta {
	public String nomeCliente;
	public String cpfCliente;
	public long numeroConta;
	public double saldo;
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso!");
			System.out.println("O seu saldo agora é de: " + saldo);
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo = valor + this.saldo;
		System.out.println("O seu saldo agora é de: " + saldo);
	}

	public void transferir(double valor, Conta conta) {
		if (this.sacar(valor)) {
			conta.depositar(valor);
		}
	}
	
	public void exibirSaldo() {
		System.out.println("Nome: " + this.nomeCliente);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("========");
	}
}
