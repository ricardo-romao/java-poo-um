package br.com.ciandt.gian73;

public class ContaCorrenteMain {

    public static void main(String[] args) {
	ContaCorrente conta1 = new ContaCorrente(100);
	conta1.depositar(50);
	conta1.sacar(150);
	System.out.println("Valor do saldo: " + conta1.getSaldo());
	System.out.println("Limite: " + conta1.getLimite());
    }

}
