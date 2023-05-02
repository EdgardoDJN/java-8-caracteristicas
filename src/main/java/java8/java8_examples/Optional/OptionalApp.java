package java8.java8_examples.Optional;

import java.util.Optional;

public class OptionalApp {
    //Gestiona de manera adecuada los errores de null pointer exception
    //Utilizar esta clase es un poco costos y se queremos tener aplicaciones
    //Criticas en rendimiento no es muy recomendable utilizarla

	public void probar(String valor){
		//System.out.println(valor.contains("mito"));			
		
		try{
            
			Optional op = Optional.empty();
            //Devuelve un valor generico
			op.get();						
		}catch(Exception e){
			System.out.println("No hay elemento");
		}		
	}
	
	public void orElse(String valor){
        //Metodos de la clase Optional
        //variable nula o no esta inicializada, si nuestra variable acepta nulos utilizamos ofNullable
		Optional<String> op = Optional.ofNullable(valor);
        //Si el valor es nulo, vamos a indicar un valor por defecto y de esta manera evitar este famoso error
		String x = op.orElse("predeterminado");
		System.out.println(x);
	}
	
	public void orElseThrow(String valor){
		Optional<String> op = Optional.ofNullable(valor);
        //Si el valor es nulo arrojamos una excepcion
		op.orElseThrow(NumberFormatException::new);
	}
	
	public void isPresent(String valor){
        //Verifica si el valor ha sido inicializado o no
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}
	
	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
		//app.probar("Mito");
		//app.orElse("Mito");
		//app.orElseThrow("Mito");
		app.isPresent("Mito");
	}
}
