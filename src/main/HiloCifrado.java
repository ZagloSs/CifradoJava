package main;

public class HiloCifrado extends Thread{
	private char caracter;
	private int pos;
	private char[] carac;
	
	public HiloCifrado(char caracter, int pos, char[] carac) {
		this.caracter = caracter;
		this.pos  =pos;
		this.carac = carac;
	}
	
	public void run() {
		carac[pos] = (char)(((int)(caracter)) + 20);
	}
}
