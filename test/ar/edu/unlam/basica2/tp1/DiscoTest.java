package ar.adu.unlam.basica2.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DiscoTest {

	@Test
	public void testCambiaRadioInterior() {
		Disco disco = new Disco();
		disco.setRadioInterior((double) 5);
		
		Assert.assertEquals((double)5, disco.getRadioInterior());
	}
	
	@Test
	public void testCambiaRadioExterior() {
		Disco disco = new Disco();
		disco.setRadioExterior((double) 10);
		
		Assert.assertEquals((double)10, disco.getRadioExterior());
	}
		
	
	@Test
	public void testEvaluaElPerimetroInterior() {
		Disco disco = new Disco((double)5,(double)10);
		Double expected = 31.400000000000002;
		
		Assert.assertEquals(expected, disco.getPerimetroInterior());
	}
	
	@Test
	public void testEvaluaElPerimetroExterior() {
		Disco disco = new Disco((double)5,(double)10);
		Double expected = 62.800000000000004;
		
		Assert.assertEquals(expected, disco.getPerimetroExterior());
	}
	
	@Test
	public void testEvaluaLaSuperficie() {
		Disco disco = new Disco((double)5,(double)10);
		Double expected = 31.400000000000002;
		
		Assert.assertEquals(expected, disco.getSuperficie());
	}
		
	

}
