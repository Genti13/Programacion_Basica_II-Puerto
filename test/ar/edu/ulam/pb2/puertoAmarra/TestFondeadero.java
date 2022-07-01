package ar.edu.ulam.pb2.puertoAmarra;

import org.junit.Assert;
import org.junit.Test;

public class TestFondeadero {

	@Test
	public void testAmarrarYate() {
		Fondero fondero = new Fondero(70);
		Yate yate = new YateMotor(10.0, "Yatecito");

		fondero.amarrarYate(yate);

		Assert.assertTrue(fondero.getYates().contains(yate));
	}

	@Test
	public void testDesamarrarYate() {
		Fondero fondero = new Fondero(70);
		Yate yate = new YateVela(10.0, "Yatecito");

		fondero.amarrarYate(yate);

		fondero.desamarrarYate(yate);

		Assert.assertFalse(fondero.getYates().contains(yate));
	}

	@Test
	public void testCantidadDeAmarrados() {
		Fondero fondero = new Fondero(70);
		Yate yate1 = new YateMotor(30.0, "Yatecito");
		Yate yate2 = new YateVela(10.0, "Yatezote");
		Yate yate3 = new YateMotor(15.0, "Juan");

		fondero.amarrarYate(yate1);
		fondero.amarrarYate(yate2);
		fondero.amarrarYate(yate3);
		
		Assert.assertEquals(fondero.getYates().size(), 3);
	}
	
	@Test
	public void  testAmarrasDisponibles(){
		Fondero fondero = new Fondero(70);
		Yate yate1 = new YateMotor(30.0, "Yatecito");
		Yate yate2 = new YateVela(10.0, "Yatezote");
		Yate yate3 = new YateMotor(15.0, "Juan");

		fondero.amarrarYate(yate1);
		fondero.amarrarYate(yate2);
		fondero.amarrarYate(yate3);
		
		Assert.assertEquals(fondero.obtenerCantidadDeAmarrasDisponibles(),(Integer) 67);
	}
	
	@Test
	public void testPrecioAmarre() {
		Fondero fondero = new Fondero(70);
		Yate yate = new YateVela(10.0, "Yatecito");

		fondero.amarrarYate(yate);
		
		Double precio = fondero.obtenerPrecioDeAmarre(yate);

		Assert.assertEquals(precio, (Double) 11000.0);
	}

	@Test
	public void testPrecioTotal(){
		Fondero fondero = new Fondero(70);
		Yate yate1 = new YateMotor(30.0, "Yatecito");
		Yate yate2 = new YateVela(10.0, "Yatezote");
		Yate yate3 = new YateMotor(15.0, "Juan");

		fondero.amarrarYate(yate1);
		fondero.amarrarYate(yate2);
		fondero.amarrarYate(yate3);
		
		Double precio = fondero.obtenerRecaudacionTotal();
		
		System.out.print(fondero.obtenerPrecioDeAmarre(yate1) + " ");
		System.out.print(fondero.obtenerPrecioDeAmarre(yate2) + " ");
		System.out.print(fondero.obtenerPrecioDeAmarre(yate3) + " ");
		
		Assert.assertEquals(precio, (Double) 36000.0);
	}

}
