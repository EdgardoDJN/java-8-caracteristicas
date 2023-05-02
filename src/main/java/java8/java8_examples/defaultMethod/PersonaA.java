package java8.java8_examples.defaultMethod;

public interface PersonaA {
    //Se puede crear n metodos por defecto

	public void caminar();
	
    //Metodo implementado en una interfaz para que cualquier clase que implemente la interfaz tenga este metodo por defecto con toda su logica
	//Es util cuando nos piden que tales clases que implementan esa interfaz tengan un comportamiento por defecto
    //Podemos resolerlo de la forma normal creando el metodo y sobreescribiendo o con los default methods
    default public void hablar(){
		System.out.println("Saludos Coders - PersonaA");
	}
    /*default public double hablar(){
		System.out.println("Saludos Coders - PersonaA");
        //Se puede retornar valor
	}
    */
}
