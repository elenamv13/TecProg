//Main.java para la práctica 3 de Tecnología de la Programación
/* Autores: David Ubide Alaiz y Elena Morón Vidal
 * NIA: 736520 y 739324
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;



class Main {
   public static void main(String[] args) {

   	//Declaramos directorios
	Directorio raiz= new Directorio("patata");
	Archivo Arriba = new Archivo("Espanya.txt",0);
	Archivo MasArriba = new Archivo("Francia.exe",100);
	Archivo EnlaCumbre = new Archivo("Alemania.NEPE",101);
	Directorio Fir= new Directorio("NP");

	// Los anyadimos
	
	raiz.addNodo(Arriba);
	raiz.addNodo(MasArriba);
	raiz.addNodo(EnlaCumbre);
	Fir.addNodo(Arriba);
	raiz.addNodo(Fir);




	// Imprimimos resultado
	int resul=raiz.getSize();
	System.out.println("Este es el resultado: "+resul);

	//	Probamos la ruta
	Ruta rutilla= new Ruta(raiz);
	// Probamos ls sobre una ruta
	rutilla.ls();

	//Probamos el stat sobre un elemento concreto
	String rutaA= rutilla.pwd();
	System.out.println(rutaA+ " Entro al CD");
	String Prueba2="/NP";
	rutilla.cd(Prueba2);
	rutaA= rutilla.pwd();

	System.out.println(rutaA);
	rutilla.stat("Francia.exe");
	
	String Prueba="/NP/asfsd/popoppop";
	String carpetasRuta[] = Prueba.split("/");
	System.out.println(carpetasRuta[1]);
	System.out.println(carpetasRuta[2]);
	System.out.println(carpetasRuta[3]);



   }
};
