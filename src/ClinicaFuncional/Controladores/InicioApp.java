package ClinicaFuncional.Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ClinicaFuncional.Dtos.EsclavoDto;
import ClinicaFuncional.Dtos.PacientesDtos;
import ClinicaFuncional.Servicios.MenuImplementacion;
import ClinicaFuncional.Servicios.MenuInterfaz;
import ClinicaFuncional.Servicios.OperacionesImplementacion;
import ClinicaFuncional.Servicios.OperacionesInterfaz;

public class InicioApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		OperacionesInterfaz op = new OperacionesImplementacion();
		List<PacientesDtos> listaPaciente = new ArrayList<PacientesDtos>();
		List<EsclavoDto> listaEsclavo = new ArrayList<EsclavoDto>();
		
		boolean cerrarMenu = false;
		int opcionMenu;
		
		while(!cerrarMenu) {
			
			opcionMenu=mi.mostrarMenuYSeleccion(sc);
			
			switch(opcionMenu) {
			
			case 0:
				System.out.println("Has elegido la opcion de cerrar menu, a continuacion se realizara esa operacion, que tenga un buen dia.");
				cerrarMenu=true;
				break;
			case 1: 
				System.out.println("A continuacion podras añadir un paciente");
				op.darAltaCliente(listaPaciente, listaEsclavo);
				for(Object nom : listaPaciente) {
					System.out.println(listaPaciente.toString());
				}
				break;
			case 2:
				System.out.println("A continuacion podras dar de baja a un paciente");
				System.out.println("Lamentandolo mucho esta funcion aun no esta disponible, que tenga un buen dia.");
				break;
			case 3: 
				System.out.println("A continuacion podras añadir un tutor del paciente");
				op.darAltaEsclavo(listaEsclavo);
				for(Object nom : listaEsclavo) {
					System.out.println(listaEsclavo.toString());
				}
				break;
			default:
				System.out.println("Error-No has elegido ningunas de las opciones disponibles.");
				break;
			}
		}

}

}
