package modelSat;

import java.util.ArrayList;
import java.util.List;

import modelSat.CrudMetodeSat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GlavnaKlasaSat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CrudMetodeSat metode = new CrudMetodeSat();//1
		
		metode.ubaciMarku("swatch1", "digitalni", "swiss", "Geneva", "strase");	//ovo je User preko ArrayListe 3
		
			List<MestoProizvodnje> listaMesta = new ArrayList<MestoProizvodnje>();
		
			MestoProizvodnje adresa1 = new MestoProizvodnje();
			adresa1.setZemlja("Srbija1");
			adresa1.setGrad("Beograd");
			adresa1.setUlica("Knez Mihajlova");
	
			listaMesta.add(adresa1);
		
			MestoProizvodnje adresa2 = new MestoProizvodnje();
			adresa2.setZemlja("Kina1");
			adresa2.setGrad("Nis");
			adresa2.setUlica("Beogradska");
		
			listaMesta.add(adresa2);
		
		metode.ubaciUsera("ivan1", "ivanovic", listaMesta);
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();		
			
			UserSat user = new UserSat();
			int brojAdresa = 0;
			Session sesija = sf.openSession();
				sesija.beginTransaction();
				try {
					user = sesija.get(UserSat.class, 1);		//1 je u stvari id baze
					brojAdresa = user.getListaMesta().size();	//size uzima za 1 id
					sesija.getTransaction().commit();
				} catch (Exception e) {
					sesija.getTransaction().rollback();
				}finally {
					sesija.close();
				}
			System.out.print("Trazeni podaci iz liste: ");
			System.out.println(user.getIme() + " "+ user.getPrezime());
			System.out.print("Ukupno ima " + brojAdresa  + " adrese");
		
	}

}
