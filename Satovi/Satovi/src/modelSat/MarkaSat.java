package modelSat;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import modelSat.MestoProizvodnje;

@Entity
@Table(name = "moj_sat")
public class MarkaSat {


	@Id // PK	
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	@Column(name = "id_sat")
	private int idSat;
	
	@Column(name = "naziv_sata")
	private String nazivSata;
	
	@Column(name = "osobine_sata")
	private String osobineSata;
	
	@Embedded
	private MestoProizvodnje mesto;
	
	public int getIdSat() {
		return idSat;
	}
	public void setIdSat(int idSat) {
		this.idSat = idSat;
	}
	public String getNazivSata() {
		return nazivSata;
	}
	public void setNazivSata(String nazivSata) {
		this.nazivSata = nazivSata;
	}
	public String getOsobineSata() {
		return osobineSata;
	}
	public void setOsobineSata(String osobineSata) {
		this.osobineSata = osobineSata;
	}
	public MestoProizvodnje getMesto() {
		return mesto;
	}
	public void setMesto(MestoProizvodnje mesto) {
		this.mesto = mesto;
	}
	
	
	
	
}
