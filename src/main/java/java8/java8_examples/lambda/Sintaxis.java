package java8.java8_examples.lambda;

public class Sintaxis {

	public double probarSintaxis() {
        //El fin de las lambdas es tener un codigo mas legible
		Operacion operacion = (double x, double y) -> (x + y) / 2;
        //Estos codigos de aca abajo no se recomiendan por la premisa en la linea 6
		//Operacion operacion = (double x, double y) -> {return (x + y) / 2;};
		/*Operacion operacion = (double x, double y) -> {
			double a = 2.0;
			System.out.println(a);
			return (x + y)/2 + a;
		};*/
		/*Operacion operacion = (x, y) -> {
			double a = 2.0;
			System.out.println(a);
			return (x + y)/2 + a;
		};*/		
		//Operacion operacion = (x, y) -> (x + y) / 2;
        //Si se definen sin paramteros como aca abajo, se debe usar el parentesis y modificar la interfaz
		//Operacion operacion = () -> 2;
		/*Operacion operacion = () -> {
			int x = 2;
			int y = 3;
			return x + y;
		};*/
		return operacion.calcular(2,3);
	}

	public static void main(String[] args) {
		Sintaxis app = new Sintaxis();
		System.out.println(app.probarSintaxis());
	}
}
