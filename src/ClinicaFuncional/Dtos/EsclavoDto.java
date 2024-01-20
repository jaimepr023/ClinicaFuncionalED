package ClinicaFuncional.Dtos;

public class EsclavoDto {
	
	long idEsclaco;
	String nombreE ="aaaaa";
	String apellidosE ="aaaaa";
	int edad  =0;
	
	String fechaNAcimiento = "9999/12/31";
	public long getIdEsclaco() {
		return idEsclaco;
	}
	public void setIdEsclaco(long idEsclaco) {
		this.idEsclaco = idEsclaco;
	}
	public String getNombreE() {
		return nombreE;
	}
	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}
	public String getApellidosE() {
		return apellidosE;
	}
	public void setApellidosE(String apellidosE) {
		this.apellidosE = apellidosE;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getFechaNAcimiento() {
		return fechaNAcimiento;
	}
	public void setFechaNAcimiento(String fechaNAcimiento) {
		this.fechaNAcimiento = fechaNAcimiento;
	}
	public EsclavoDto(long idEsclaco, String nombreE, String apellidosE, int edad, String fechaNAcimiento) {
		super();
		this.idEsclaco = idEsclaco;
		this.nombreE = nombreE;
		this.apellidosE = apellidosE;
		this.edad = edad;
		this.fechaNAcimiento = fechaNAcimiento;
	}
	public EsclavoDto() {
		super();
	}
	
	@Override
	public String toString() {
		return "EsclavoDto [idEsclaco=" + idEsclaco + ", nombreE=" + nombreE + ", apellidosE=" + apellidosE + ", edad="
				+ edad + ", fechaNAcimiento=" + fechaNAcimiento + "]";
	}
	
	

}
