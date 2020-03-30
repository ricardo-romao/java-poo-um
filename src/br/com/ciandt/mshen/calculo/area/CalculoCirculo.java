package br.com.ciandt.mshen.calculo.area;

public class CalculoCirculo extends CalculoArea {
    public void calcularArea(int raio) {
	this.setArea(Math.PI * Math.pow(raio, 2));
    }

}
