package dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import model.Personel;

public class Islemler {

	public static void main(String[] args)

	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory(); // SessionFactory Nesnesi
																						// Üretiliyor
		Session session = factory.openSession(); // Session Nesnesi Üretiliyor
		Transaction transaction = session.getTransaction(); // Transaction Nesnesi Üretiliyor

		Personel personel = new Personel(); // Kalıcı Sınıfımızdan Nesne Üretiliyor
											// Gerekli atamalar yapılıyor

		personel.setPersonel_id(18);
		personel.setPersonel_isim("Furkan");
		personel.setPersonel_soyisim("KOC");
		personel.setPersonel_maas(4250);

		try {

			transaction.begin(); // İşlem başlatılıyor
			session.save(personel); // personel nesnemiz kalıcı hale getiriliyor tablomuza ekleniyor
			transaction.commit(); // işlem gerçekleştiriliyor

		} catch (Exception e) {
			transaction.rollback(); // Eğer herhangi bir hata meydana gelirse işlemler geri alınıyor
			System.out.println("Hata Var :" + e.toString());

		} finally {
			session.close(); // Session nesnemizi kapatıyoruz
		}
	}
}