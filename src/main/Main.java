package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<HiloCifrado> hilos = new ArrayList<>();
		
		
		
		System.out.println("Introduzca una cadena");
		String cad = sc.nextLine();
		
		char[] caracteres = cad.toCharArray();
		char[] carac = new char[caracteres.length];
		
		for(int i = 0; i<caracteres.length; i++) {
			HiloCifrado newHilo = new HiloCifrado(caracteres[i], i, carac);
			hilos.add(newHilo);
			
			newHilo.start();
		}
		
		try {
			
			for(HiloCifrado hilo : hilos) {
				hilo.join();
			}
			
	
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		String fraseCifrada = "";
		
		for(char caracter: carac) {
			fraseCifrada += caracter;
		}
		System.out.println(fraseCifrada);
		
		

	}

}
