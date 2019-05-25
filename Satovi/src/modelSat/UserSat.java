package modelSat;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import modelSat.MestoProizvodnje;

@Entity
//@ table name user - igor
public class UserSat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	private String ime;
	private String prezime;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<MestoProizvodnje> listaMesta = new ArrayList<MestoProizvodnje>();

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public List<MestoProizvodnje> getListaMesta() {
		return listaMesta;
	}

	public void setListaMesta(List<MestoProizvodnje> listaMesta) {
		this.listaMesta = listaMesta;
	}	
	
}
