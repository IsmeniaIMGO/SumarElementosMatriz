package Quiz.test;

public class Matriz {
	
	private static int[][] matriz = {
			{1, 1, 1},
			{1, 1, 1},
			{1, 1, 1}
	};
	
	private static int suma = 0;

	public static void main(String[] args) {
		
		sumarMatrizCon(0, matriz[0].length-1);
		System.out.println("Suma de elementos con recursividad: "+ suma+"\n");
		
		System.out.println("Suma de elementos sin recursividad: "+ sumarMatrizSin());

	}
	
	/**
	 * Metodo que me permite recorrer las filas de izquierda a derecha
	 * @param i
	 * @param j
	 */
	private static void sumarMatrizCon(int i, int j) {
		int valor = 0;
		//caso base
		if (i == matriz.length) {
			return;
		//caso recursivo
		}else {
			recorrerColumna(i, j, valor);//metodo que me recorre las columnas de una fila
			sumarMatrizCon(i+1, j);//metodo recursivo que me aumenta la fila
		}
		return;
	}

	/**
	 * Metodo que en una misma fila me recorre las columnas de abajo hacia arriba
	 * y me obtiene la suma de los elementos de una columna
	 * @param i
	 * @param j
	 * @param valor
	 */
	private static void recorrerColumna(int i, int j, int valor) {
	
		if (j == -1) {
			suma = suma + valor; //me suma el valor de la suma de los elementos de cada columna
			return;
		}else {
			valor = valor + matriz[i][j]; 
			recorrerColumna(i, j-1, valor);
		}
		return;
	}
	
	
	/**
	 * Metodo que suma los elementos de una matriz sin recursividad
	 * @return
	 */
	private static int sumarMatrizSin() {
		int suma = 0;
		
		for (int i = 0; i < matriz.length; i++) {//recorre filas de izquierda a derecha
			for (int j = matriz[0].length-1;j>=0; j--) {//recorre columnas de abajo hacia arriba
				suma = matriz[i][j] + suma;//me suma cada elemento
			}
		}
		
		return suma;
	}
	
	
	

}
