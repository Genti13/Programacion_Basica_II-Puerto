package ar.edu.ulam.pb2.puertoAmarra;

import java.util.LinkedHashSet;
import java.util.Set;

public class Fondero {
	private Set<Yate> yates = new LinkedHashSet<>();
	private Integer amarras;

	public Fondero(Integer max) {
		this.amarras = max;
	}

	public Integer obtenerCantidadDeYatesAmarrados() {
		return this.yates.size();
	}

	public Integer obtenerCantidadDeAmarrasDisponibles() {
		return this.amarras - this.yates.size();
	}

	public void amarrarYate(Yate yate) {
		yates.add(yate);
	}

	public void desamarrarYate(Yate yate) {
		yates.remove(yate);
	}

	public Set<Yate> getYates() {
		return this.yates;
	}

	public Double obtenerPrecioDeAmarre(Yate yate) {
		Double valor;
		if (yate instanceof YateMotor) {
			valor = (double) (yate.getEslora() > 20 ? 3000 + 10000 : 2000 + 10000);
		} else {
			valor = (double) (yate.getEslora() > 20 ? 3000 + 9000 : 2000 + 9000);
		}
		return valor;

	}

	public Double obtenerRecaudacionTotal() {
		Double recaudacion = 0.0;

		for (Yate yate : yates) {
			recaudacion += obtenerPrecioDeAmarre(yate);
		}
		return recaudacion;
	}

}
