package satInheritans;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorType;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name = "Tabela")
/*@Inheritance(strategy = InheritanceType.SINGLE_TABLE)	//SINGLE_TABLE - sve u jednoj tabeli			
@DiscriminatorColumn (name ="klasa", discriminatorType = DiscriminatorType.STRING)*/

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)	//TABLE_PER_CLASS

@Inheritance(strategy = InheritanceType.JOINED)		//JOINED

public class UserSatInheritans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //SINGLE_TABLE i JOINED
	
	//@GeneratedValue(strategy = GenerationType.TABLE)	   //TABLE_PER_CLASS
	
	private int idUser;
	private String ime;
	private String prezime;
	
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
	
}
