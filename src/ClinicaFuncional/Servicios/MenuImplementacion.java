package ClinicaFuncional.Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	@Override
	public int mostrarMenuYSeleccion(Scanner sc) {
		System.out.println("¿QUe opcion desea utilizar?");
		
		System.out.println("------------------------------");
		System.out.println("Opcion 0. Cerrar menu");
		System.out.println("Opcion 1. Añadir cliente");
		System.out.println("Opcion 2. Eliminar cliente");
		System.out.println("Opcion 3. Añadir tutor del paciente");
		System.out.println("------------------------------");
		
		int opcion = sc.nextInt();
		
		return opcion;
	}

}
