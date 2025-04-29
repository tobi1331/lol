package test;


public class Array_Test {

	static int name=0;
	
	
	public static void main(String[] args) {
//		 int n = 30; // Beispielwert
//	        double summe = rekursiv(n);
//	        System.out.println("Die harmonische Summe von 1 bis " + n + " ist: " + summe);
		
//		int[] a = {1,2,3,4};
//		int n = 4;
//		
//		double durchschnittlol = durchschnitt(a,n);
//		System.out.println(durchschnittlol);
//		
		
//		int x = 25;
//		int y = 4;
//		int potenz = modulo(x,y);
//		System.out.println(potenz);
		
		
		
//		 int[] array = {1, 2, 3, 4};
//	        int n = array.length;
//	        double durchschnitt = berechneDurchschnitt(array, n);
//	        System.out.println("Durchschnitt: " + durchschnitt);
		
		int zahl= berechneZahl(2);
		System.out.println(zahl);
		
	}
	
	public static void arrays() {
		for(int i=0;i<5;i++) {
			int[] name= new int[5];
		}
		
	}

	
	
	public static double rekursiv(int n) {
		
		if(n==1) {
			return 1.0;
		}
		else {
			return 1.0/n+rekursiv(n-1);
		}
	
		
		
	}
	
	public static int potenz(int a, int b) {
		if(b==0) {
			return 1;
		}
		return a * potenz(a,b-1);
	}
	
	
	public static int modulo(int x, int y) {
		
		if(x<y) {
			return x;
		}
		else {
			return modulo(x-y,y);
		}		
		
	}
	
	

	    public static double berechneDurchschnitt(int[] a, int n) {
	        if (n <= 0) {
	            return 0; // Sicherheitscheck für ungültige Eingabe
	        }
	        int summe = berechneSumme(a, n);
	        return (double) summe / n;
	    }

	    private static int berechneSumme(int[] a, int n) {
	        if (n == 1) {
	            return a[0];
	        }
	        return berechneSumme(a, n - 1) + a[n - 1];
	    }

	   
	
	public static int berechneZahl(int n) {
		int a = 0;
		for(int i = 1; i<=n; i++) {
			int k=1;
			while(k<n) {
				k += 1;
			}
			a = a + 2*k;
			a = a + 1;
			
			
			
		}
		int b = 1;
		for(int j = 1; j<=n; j++) {
			int p = 0;
			for(int l = 1; l<=n; l++) {
				p = p+2*l;
			}
			p = p/2;
			b = b+2*p;
			
		}
		return a+b;
	}
	
	
	
	
	
	
}
