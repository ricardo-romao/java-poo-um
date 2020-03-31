package br.com.ciandt.gian73;

public class Conta {
    private double saldo;

    public double getSaldo() {
	return saldo;
    }

    public void depositar(double valor) {
	saldo += valor;
    }

    public void sacarValor(double valor) {
	saldo -= valor;
    }

}
