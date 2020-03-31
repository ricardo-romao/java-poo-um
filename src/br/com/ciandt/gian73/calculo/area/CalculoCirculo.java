package br.com.ciandt.gian73.calculo.area;

public class CalculoCirculo extends CalculoArea {
    public void calcularArea(int raio, double Pi) {
	this.setArea(Pi * Math.pow(raio, 2));
    }

}