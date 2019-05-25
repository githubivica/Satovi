package satInheritans;

import javax.persistence.Entity;

@Entity
public class SatPosao extends UserSatInheritans {

	private String firma;
	private int telPosao;
	
	public String getFirma() {
		return firma;
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	public int getTelPosao() {
		return telPosao;
	}
	public void setTelPosao(int telPosao) {
		this.telPosao = telPosao;
	}
	
	
}
