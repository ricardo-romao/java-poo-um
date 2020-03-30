package br.com.ciandt.mshen.calculo.area;

public class CalculoQuadrado extends CalculoArea {

    public void calcularArea(int lado) {
	this.setArea(Math.pow(lado, 2));
    }

}
