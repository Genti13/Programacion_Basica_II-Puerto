package ar.edu.ulam.pb2.puertoAmarra;

public class YateMotor extends Yate {
	private String desplazamiento;
	private String propulsion;
	private Integer potecia;
	private Integer velocidad;
	private Integer autonomia;
	
	public YateMotor(Double eslora, String nombre){
		this.setEslora(eslora);
		this.setNombre(nombre);
	}

}
