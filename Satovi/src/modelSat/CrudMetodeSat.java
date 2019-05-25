package modelSat;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelSat.MestoProizvodnje;
import modelSat.MarkaSat;
import modelSat.UserSat;

public class CrudMetodeSat {
	
	private SessionFactory sf = new Configuration().configure().buildSessionFactory();

	public void ubaciUsera(String ime, String prezime, List<MestoProizvodnje> listaMesta) {
																//ubaci sat
		UserSat user = new UserSat();
		user.setIme(ime);						//ime
		user.setPrezime(prezime);				//prezime
		user.setListaMesta(listaMesta);		//lista

			Session sesija = sf.openSession();
			sesija.beginTransaction();
			try {

				sesija.save(user);					//snima izmenu

				sesija.getTransaction().commit();
				System.out.println("Uspesno ubacen sat");
			} catch (Exception e) {
				sesija.getTransaction().rollback();
				System.out.println("Nije ubacio");
			}finally {
				sesija.close();
			}
	}
	
	public void ubaciMarku(String nazivSata, String osobineSata, String zemlja, String grad, String ulica) {
																//ubaci marku
		MestoProizvodnje mesto = new MestoProizvodnje();
		mesto.setZemlja(zemlja);
		mesto.setGrad(grad);
		mesto.setUlica(ulica);

		MarkaSat marka = new MarkaSat();
		marka.setNazivSata(nazivSata);
		marka.setOsobineSata(osobineSata);
		marka.setMesto(mesto);

		Session sesija = sf.openSession();
		sesija.beginTransaction();
		try {
			sesija.save(marka);
			sesija.getTransaction().commit();	
			System.out.println("Uspesno ubacena marka");
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			System.out.println("Nije ubacio");
		}finally {
			sesija.close();
		}
	}
	
	/*public MarkaSat vratiMarkuSat(int idMarke) {				//vrati marku
			
			MarkaSat marka = null;
			Session sesija = sf.openSession();
				sesija.beginTransaction();
				try {
					marka = sesija.get(Marka.class,idMarke);
					sesija.getTransaction().commit();
					return marka;
				} catch (Exception e) {
					sesija.getTransaction().rollback();
					return null;
				}finally {
					sesija.close();
				}
		}*/
	
	
	/*public boolean azurirajZemlju(int idMarke, String zemlja) {		//azuriraj zemlju
		
		Marka marka =vratiMarku(idMarke);
		
		Session sesija = sf.openSession();
			sesija.beginTransaction();
			try {
					if(marka != null) {
						marka.getAdresa().setZemlja(zemlja);
						sesija.update(marka);
						System.out.println("Update uspeo");
						sesija.getTransaction().commit();
						return true;
					}else {
						System.out.println("Nije uspeo update");
						sesija.getTransaction().commit();
						return false;
					}
			} catch (Exception e) {
				sesija.getTransaction().rollback();
				return false;
			}finally {
				sesija.close();
			}
	}*/
	
	/*public boolean obrisiMarku(int idMarke) {			//obrisi marku
		
		Marka marka =vratiMarku(idMarke);
		
		Session sesija = sf.openSession();
			sesija.beginTransaction();
			try {
					if(marka != null) {
						sesija.delete(marka);
						System.out.println("delete uspeo");
						sesija.getTransaction().commit();
						return true;
					}else {
						System.out.println("Nije uspeo delete");
						sesija.getTransaction().commit();
						return false;
					}
			} catch (Exception e) {
				sesija.getTransaction().rollback();
				return false;
			}finally {
				sesija.close();
			}
		
	}*/
	

	
	
	
}
