package ClinicaFuncional.Servicios;

import java.util.List;
import java.util.Scanner;

import ClinicaFuncional.Dtos.EsclavoDto;
import ClinicaFuncional.Dtos.PacientesDtos;

public class OperacionesImplementacion implements OperacionesInterfaz{
	
	private PacientesDtos nuevoPaciente(List<EsclavoDto> listaEsclavo) {
		Scanner sc = new Scanner(System.in);
		PacientesDtos pacienteN = new PacientesDtos();
		
		
		System.out.println("Dime el nombre de su nuevo cliente: ");
		pacienteN.setNombreP(sc.next());
		
		System.out.println("Dime la fecha de nacimiento de su nuevo cliente: ");
		pacienteN.setFechaNAcimiento(sc.next());
		
		System.out.println("Dime la edad de su nuevo cliente: ");
		pacienteN.setEdad(sc.nextInt());
		
		System.out.println("¿El tutor ya existe?(s/n)");
		String afirmacion = sc.next();
		if(afirmacion.equals("s")) {
			
			System.out.println("Dime el id del tutor del nuevo cliente: ");
			pacienteN.setIdExclavo(sc.nextLong());
			
			if(pacienteN.getIdExclavo()!=) {	
				System.out.println("¿El tutor no existe, se le redirigira a una nueva pagina para crear un nuevo tutor.");
				darAltaEsclavo(listaEsclavo);
			}else{};
	
		}else {
			darAltaEsclavo(listaEsclavo);
		}
		
		return pacienteN;
	}
	

	@Override
	public void darAltaCliente(List<PacientesDtos> listaPaciente, List<EsclavoDto> listaEsclavo) {
		PacientesDtos nuevoPacienteL = nuevoPaciente(listaEsclavo);
		listaPaciente.add(nuevoPacienteL);
	}
	

	
	
	private EsclavoDto nuevoEsclaco() {
		EsclavoDto esclavoN = new EsclavoDto();
		Scanner sc = new Scanner(System.in);
		//Como hemos puesto la condicio anteriormente de que el id tengan que coincidir aqui tambien le pedimos el id(porque no se genera automaticamente aun)
		System.out.println("Dame el id el tutor");
		esclavoN.setIdEsclaco(sc.nextLong());
		
		System.out.println("Dame el nombre del tutor");
		esclavoN.setNombreE(sc.next());
		
		System.out.println("Dame el apellido del tutor");
		esclavoN.setApellidosE(sc.next());
		
		System.out.println("Dame la fecha de nacimiento del tutor");
		esclavoN.setFechaNAcimiento(sc.next());
		
		System.out.println("Dame la edad el tutor");
		esclavoN.setEdad(sc.nextInt());
		
		return esclavoN ;
		
	}
	
	@Override
	public void darAltaEsclavo(List<EsclavoDto> listaEsclavo) {
		EsclavoDto nuevoEsclavo = nuevoEsclaco();
		listaEsclavo.add(nuevoEsclavo);
		
	}

}
