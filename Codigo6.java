package ejerciciocodigo6;
/*
 * El códigogenera un arreglo de 20 números aleatorios entre 20 y 400 y luego, solicita al usuario seleccionar una opción para resaltar los números que son múltiplos de 5 o 7. 
 */
import java.util.Scanner; //importo la biblioteca para usar el sacnner
public class codigo6 {
	public static void main(String[] args) { //agregue el main y se ponen bien los corchetes para trabajar dentro de el main
		 int[] n = new int[20]; //new

		    for (int i = 0; i < 20; i++) {//i++
		      n[i] = (int)(Math.random() * 381) + 20;
		      System.out.print(n[i] + " ");//.out
		    }
		    
		    System.out.println("\n¿Qué números quiere resaltar? ");//println
		    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    
		    Scanner scanner = new Scanner(System.in);
	        int opcion = Integer.parseInt(scanner.nextLine()); //cambie las lineas para utilizar el scanner y así recibir la entrada del usuario

		    int multiplo = (opcion == 1) ? 5 : 7;//se cambia : 5 ? 7 por ? 5 : 7

		    //foreach (char e : n) {
		    for (int i = 0; i < n.length; i++) {
		      if (n[i] % multiplo == 0) { //cambie el foreach por un for y en el if quite e
		        System.out.print("[" + n[i] + "] ");
		       
		      }else {
		        System.out.print(n[i] + " ");//coriijo el print.in por out y cambio mi n[i]
		      }
		    }
		
} 
  
}