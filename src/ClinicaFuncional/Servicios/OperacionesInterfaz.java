package ClinicaFuncional.Servicios;

import java.util.List;

import ClinicaFuncional.Dtos.EsclavoDto;
import ClinicaFuncional.Dtos.PacientesDtos;

public interface OperacionesInterfaz {
	
	public void darAltaCliente(List<PacientesDtos> listaPaciente,List<EsclavoDto> listaEsclavo);

	public void darAltaEsclavo(List<EsclavoDto> listaEsclavo);

}
