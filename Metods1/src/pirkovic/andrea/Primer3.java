package pirkovic.andrea;

public class Primer3 { 
	final static int vrsta = 3; 
	final static int kolona = 3; 
	static void prikaziMatricu(int matrica[][]) { 
		System.out.println("Dobijena matrica izgleda "); 
		for (int i = 0; i < vrsta; i ++) {
for (int j = 0; j < kolona; j ++) System.out.print(" " + matrica[i][j]); System.out.println(); 
} }
	public static void main(String[] args) {
		int a[][] = {{1, 2, 4}, {3, 4, 5}, {3, 4, 5}}; prikaziMatricu(a); 
		} }
