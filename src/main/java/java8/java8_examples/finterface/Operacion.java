package java8.java8_examples.finterface;

@FunctionalInterface
public interface Operacion {
	//Define una unica operación, un solo metodo
	//Un único metodo abstracto, y N métodos default.
	//Podemos utilizar predicates, consumers, supplier entre otros para no tener 
	//que estar creando interfaces funcionales desde cero
	//el uso de la anotación @FunctionalInterface es para chequear en tiempo de compilación
	//si es una interfaz funcional valida
	double calcular(double n1, double n2);	
	default int suma(int n1, int n2) {
		return n1 + n2;
	}
	//Hacemos otro metodo aca abajo, nos va a decir donde implementamos esto, que debe ser interfaz funcional
	//utilizando expresiones lambda solo pueden hacer referencia a un metodo que sea abstracto
}
