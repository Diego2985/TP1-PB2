package ar.edu.unlam.basica2.tp1;

public class Disco {

	private Double radioInterior;
	private Double radioExterior;
	static final Double PI = 3.14;
	
	public Disco (Double radInterno, Double radExterno) {
		radioInterior = radInterno;
		radioExterior = radExterno;		
	}
	
	public void setRadioInterior(Double radioInterior){
		this.radioInterior = radioInterior;
	}
	
	public Double getRadioInterior(){
		return radioInterior;
	}
	
	public void setRadioExterior(Double radioExterior){
		this.radioExterior = radioExterior;
	}
	
	public Double getRadioExterior(){
		return radioExterior;
	}
	
	public Double getPerimetroInterior(){
		return (2 * PI * radioInterior);		 
	}
	
    public Double getPerimetroExterior(){
    	return (2 * PI * radioExterior);
	}
    
    public Double getSuperficie(){
    	return (getPerimetroExterior() - getPerimetroInterior());
    }
}

