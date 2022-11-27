package bll;

public class OperacionesCalcu {
	public double numero1;
	public double numero2;
	public OperacionesCalcu(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public double suma() {
		return this.numero1+this.numero2;
	}
	
	
	public double resta() {
		return this.numero1-this.numero2;
	}
	
	public double multi() {
		return this.numero1*this.numero2;
	}
	public double division() {
		return this.numero1/this.numero2;
	}
	
	public double potencia() {
		return Math.pow(numero1, numero2);
	}
	
	
}

