package java8.java8_examples.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	private List<Integer> numeros;

	public void llenar() {

		numeros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
	}

	public void probarStream() {
		numeros.stream().forEach(System.out::println);
	}

    //Este se procesa con hilos, utiliza el framework forkjoin y es asincrono
    //No utilizar esto en Java EE container, por ejemplo servidores de aplicaciones que tengan interacción con jpa
    //Hacerlo con moderación y en casos puntuales
    //Bash y aplicaciones de escritorio
	public void probarParalelo() {
		numeros.parallelStream().forEach(System.out::println);
	}

	public static void main(String[] args) {
		ParallelStream app = new ParallelStream();

		app.llenar();
		//app.probarStream();
		app.probarParalelo();

	}

}
