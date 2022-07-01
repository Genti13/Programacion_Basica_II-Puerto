package ar.edu.ulam.pb2.puertoAmarra;

public abstract class Yate {
	private String nombre;
	private String duenio;
	private Double manga;
	private Double calado;
	private Double eslora;
	private Integer tripulacion;
	private Double peso;

	public Double getEslora() {
		return this.eslora;
	}

	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duenio == null) ? 0 : duenio.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yate other = (Yate) obj;
		if (duenio == null) {
			if (other.duenio != null)
				return false;
		} else if (!duenio.equals(other.duenio))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
