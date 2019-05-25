package satInheritans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GlavnaSatInheritans {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		UserSatInheritans user = new UserSatInheritans();
		
		user.setIme("Ana");
		user.setPrezime("Antic");
		
		SatPosao posao = new SatPosao();
			posao.setIme("Branko");
			posao.setPrezime("Babic");
			posao.setFirma("microsoft");
			posao.setTelPosao(111);

			
		SatKuca kuca = new SatKuca();
			kuca.setIme("Vanja");
			kuca.setPrezime("Vesic");
			kuca.setAdresa("marsala tita bb");
			kuca.setTelKuca(222);
		
		Session sesija = sf.openSession();
			sesija.beginTransaction();
				try {
					
					sesija.save(user);
					sesija.save(posao);
					sesija.save(kuca);
					
					sesija.getTransaction().commit();
				} catch (Exception e) {
					sesija.getTransaction().rollback();
				}finally {
					sesija.close();
				}	

	}

}
