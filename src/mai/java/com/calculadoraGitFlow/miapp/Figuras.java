package mai.java.com.calculadoraGitFlow.miapp;

public class Figuras {

	public static double areaCuadrado (double ancho, double largo) {
		return ancho*largo;
	}
	
	public static double dencidadCubo (double ancho, double largo, double profundidad) {
		return ancho*largo*profundidad;
	}
	
	public static double areaTriangulo(double base, double altura) {
	    return (base * altura) / 2;
	}
	
	public static double areaCirculo(double radio) {
	    return Math.PI * Math.pow(radio, 2);
	}
	
	public static double areaTrapecio(double base1, double base2, double altura) {
	    return ((base1 + base2) * altura) / 2;
	}
}