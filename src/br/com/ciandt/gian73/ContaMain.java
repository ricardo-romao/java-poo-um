package br.com.ciandt.gian73;

public class ContaMain {

    public static void main(String[] args) {
	Conta conta1 = new Conta();
	Conta conta2 = new Conta();

	conta1.depositar(100);
	conta1.depositar(50);
	System.out.println("Valor do saldo: " + conta1.getSaldo());

	conta2.depositar(100);
	conta2.sacarValor(40);
	System.out.println("Valor do saldo: " + conta2.getSaldo());
    }

}