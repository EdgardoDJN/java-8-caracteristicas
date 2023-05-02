package java8.java8_examples.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB{

	@Override
	public void caminar() {		
		System.out.println("Hola gente");
	}	
		
	@Override
	public void hablar() {
		//PersonaB.super.hablar(); con esto digo la interfaz que necesito para implementar el metodo
		//Lo de aca abajo es por si otra clase necesita implementar su propia logica
        System.out.println("Generalmente hablo mucho");
	}
	
	/*@Override
	public void hablar() {
		PersonaB.super.hablar();
	
	}*/

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.hablar();
	}
	
}
