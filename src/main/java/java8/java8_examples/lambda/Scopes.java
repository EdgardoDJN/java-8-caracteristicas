package java8.java8_examples.lambda;

public class Scopes {
	
	private static double atributo1;
	private double atributo2;	
	
	public double probarLocalVariable(){
		
        //final es opcional en una expresion lamda o objeto anonimo, sino se coloca se comporta como final
        //vale 1 si no se coloca
        //final en variables locales 
		final double n3 = 3;
        //Una iterfaz no puede instanciarse(implementamos metodos), pero si se puede crear una clase anonima
		Operacion op = new Operacion(){

			@Override
			public double calcular(double n1, double n2) {				
				return n1 + n2 + n3;
			}
		};
		
		Operacion operacion = (x,y) -> {				
			return x + y + n3;
		};
				
		return operacion.calcular(1,1);
	}
	
	public double probarAtributosStaticVariables(){
		//Objetos anonimos que se instancian a partir de una interfaz donde tenemos que implementar metodos
        //Las variables sean locales, globales o mas conocidas como atributos de tipo estatico o no
        //Tienen el mismo comportamiento en un objeto anonimo y en una expresion lambda
		Operacion op = new Operacion(){
            
			@Override
			public double calcular(double n1, double n2) {
				atributo1 = n1 + n2;
				atributo2 = atributo1;
				return atributo2;
			}			
		};
		
		Operacion operacion = (x, y) -> {				
			atributo1 = x + y;
			atributo2 = atributo1;
			return atributo2;
		};
		return operacion.calcular(3, 2);
	}
	
	
	public static void main(String... mitocode) {
		Scopes app = new Scopes();
		System.out.println(app.probarAtributosStaticVariables());
	}

}
