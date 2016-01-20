/**
 * 
 * @author SAIN PEDRAZA GUERRERO 9ITI1
 *
 */
public class Operaciones {
	/**
	 * 
	 * @param n1 variable que es utilizada para calcular como Base del cuadrado
	 * @return variable de tipo int y double para mejor precision de resultados
	 */
	public int areaCuadrado(int n1){
		return n1 * n1;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del rectangulo
	 * @param n2 que es utilizada para calcular como Altura del rectangulo
	 * @return de tipo int y double para mejor precision de resultados
	 */
	public int areaRectangulo(int n1, int n2){
		return n1 * n2;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del circulo ingresando radio
	 * @return tipo int y double para mejor precision de resultados
	 */
	public float areaCirculoRadio(float n1){
		return (float) (n1 * n1 * Math.PI) ;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del circulo ingresando diametro
	 * @return tipo int y double para mejor precision de resultados
	 */
	public float areaCirculoDiametro(float n1){
		return (float) ((n1/2) * n1 *Math.PI);
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del triangulo escaleno
	 * @param n2 que es utilizada para calcular como Altura del triangulo escaleno
	 * @return tipo int y double para mejor precision de resultados
	 */
	public int areaTrianguloEscaleno(int n1, int n2){
		return n1 * n2 / 2;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del triangulo isosceles
	 * @param n2 que es utilizada para calcular como Altura del triangulo isosceles
	 * @return tipo int y double para mejor precision de resultados
	 */
	public double areaTrianguloIsosceles(double n1, double n2){
		return (n2*Math.sqrt(n1*n1-(n2*n2)/4)/2);
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del triangulo equilatero
	 * @return tipo int y double para mejor precision de resultados
	 */
	public double areaTrianguloEquilatero(double n1){
		return (Math.sqrt(3)/4*(n1*n1));
	}

}
