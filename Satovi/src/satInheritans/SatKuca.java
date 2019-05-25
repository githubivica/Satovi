package satInheritans;

import javax.persistence.Entity;

@Entity
public class SatKuca extends UserSatInheritans {

	private String adresa;
	private int telKuca;
	
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getTelKuca() {
		return telKuca;
	}
	public void setTelKuca(int telKuca) {
		this.telKuca = telKuca;
	}
	
	
	
}
