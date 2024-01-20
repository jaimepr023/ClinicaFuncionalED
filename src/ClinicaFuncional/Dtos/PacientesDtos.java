package ClinicaFuncional.Dtos;

public class PacientesDtos {
	
	long idPaciente;
	String fechaNAcimiento="9999/12/31";
	String nombreP ="aaaaa";
	long idExclavo ;
	int edad = 0;
	public long getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getFechaNAcimiento() {
		return fechaNAcimiento;
	}
	public void setFechaNAcimiento(String fechaNAcimiento) {
		this.fechaNAcimiento = fechaNAcimiento;
	}
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public long getIdExclavo() {
		return idExclavo;
	}
	public void setIdExclavo(long idExclavo) {
		this.idExclavo = idExclavo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public PacientesDtos(long idPaciente, String fechaNAcimiento, String nombreP, long idExclavo, int edad) {
		super();
		this.idPaciente = idPaciente;
		this.fechaNAcimiento = fechaNAcimiento;
		this.nombreP = nombreP;
		this.idExclavo = idExclavo;
		this.edad = edad;
	}
	public PacientesDtos() {
		super();
	}
	@Override
	public String toString() {
		return "Dtos [idPaciente=" + idPaciente + ", fechaNAcimiento=" + fechaNAcimiento + ", nombreP=" + nombreP
				+ ", idExclavo=" + idExclavo + ", edad=" + edad + "]";
	}

	
	
}
