package com.vikas.hibernate.example.chapter4.recipe0;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExecutableClass_tab_per_class {

	public void test() { // table per class
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Disc disc = new Disc();
		disc.setName("Blank CDR");
		disc.setPrice(199);
		session.save(disc);
		VideoDisc videoDisc = new VideoDisc();
		videoDisc.setName("Blazing Saddles");
		videoDisc.setPrice(1499);
		videoDisc.setDirector("Mel Brooks");
		videoDisc.setLanguage("english");
		session.save(videoDisc);
		AudioDisc audioDisc = new AudioDisc();
		audioDisc.setName("Grace Under Pressure");
		audioDisc.setPrice(999);
		audioDisc.setArtist("Rush");
		audioDisc.setTrackCount(8);
		session.save(audioDisc);
		tx.commit();
		session.close();
		session = SessionManager.openSession();
		tx = session.beginTransaction();
		Disc disc1 = (Disc) session.load(Disc.class, disc.getId());
		if (disc1 != null && disc1.getName().equals(disc.getName())) {
			System.out.println("Discs are Equal !!!!!!!!!!!!");
		} else {
			System.out.println("Discs are not eqal @@@@@@@@@@@");
		}
		VideoDisc videoDisc2 = (VideoDisc) session.load(VideoDisc.class, videoDisc.getId());
		if (videoDisc2 != null && videoDisc2.getName().equals(videoDisc.getName())) {
			System.out.println("Video Discs are Equal !!!!!!!!!!!!");
		} else {
			System.out.println("Video Discs are not eqal @@@@@@@@@@@");
		}
		tx.commit();
		session.close();

		session = SessionManager.openSession();
		session.setDefaultReadOnly(true);
		tx = session.beginTransaction();
		Query query = session.createQuery("from Disc d where d.price>:price");
		query.setParameter("price", 1299);
		List<Disc> results = query.list();
		/*
		 * for (Disc d : results) { switch (d.getClass().getName()) { case "Disc":
		 * assertEquals(d.getName(), "Blank CDR"); break; case "AudioDisc": AudioDisc
		 * audioDisc = (AudioDisc) d; assertEquals(audioDisc.getArtist(), "Rush");
		 * break; case "VideoDisc": VideoDisc videoDisc = (VideoDisc) d;
		 * assertEquals(videoDisc.getDirector(), "Mel Brooks"); break; } }
		 */
		tx.commit();
		session.close();
	}

	public void test2() { // table per sub class
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Disc2 disc = new Disc2();
		disc.setName("Blank CDR");
		disc.setPrice(199);
		session.save(disc);
		VideoDisc2 videoDisc = new VideoDisc2();
		videoDisc.setName("Blazing Saddles");
		videoDisc.setPrice(1499);
		videoDisc.setDirector("Mel Brooks");
		videoDisc.setLanguage("english");
		session.save(videoDisc);
		AudioDisc2 audioDisc = new AudioDisc2();
		audioDisc.setName("Grace Under Pressure");
		audioDisc.setPrice(999);
		audioDisc.setArtist("Rush");
		audioDisc.setTrackCount(8);
		session.save(audioDisc);
		tx.commit();
		session.close();
		session = SessionManager.openSession();
		session.setDefaultReadOnly(true);
		tx = session.beginTransaction();
		Disc2 disc1 = (Disc2) session.load(Disc2.class, disc.getId());
		VideoDisc2 videoDisc2 = (VideoDisc2) session.load(VideoDisc2.class, videoDisc.getId());
		tx.commit();
		session.close();
	}

	public void test3() { // table per class
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Disc3 disc = new Disc3();
		disc.setName("Blank CDR");
		disc.setPrice(199);
		session.save(disc);
		VideoDisc3 videoDisc = new VideoDisc3();
		videoDisc.setName("Blazing Saddles");
		videoDisc.setPrice(1499);
		videoDisc.setDirector("Mel Brooks");
		videoDisc.setLanguage("english");
		session.save(videoDisc);
		AudioDisc3 audioDisc = new AudioDisc3();
		audioDisc.setName("Grace Under Pressure");
		audioDisc.setPrice(999);
		audioDisc.setArtist("Rush");
		audioDisc.setTrackCount(8);
		session.save(audioDisc);
		tx.commit();
		session.close();
		session = SessionManager.getSessionFactory().openSession();
		session.setDefaultReadOnly(true);
		tx = session.beginTransaction();
		VideoDisc3 videoDisc2 = (VideoDisc3) session.load(VideoDisc3.class, videoDisc.getId());
		tx.commit();
		session.close();

		session = SessionManager.getSessionFactory().openSession();
		session.setDefaultReadOnly(true);
		tx = session.beginTransaction();
		Query query = session.createQuery("from Disc3 d");
		List<Disc3> results = query.list();
		/*
		for (Disc3 d : results) {
			switch (d.getClass().getName()) {
			case "Disc":
				assertEquals(d.getName(), "Blank CDR");
				break;
			case "AudioDisc":
				AudioDisc3 audioDisc = (AudioDisc3) d;
				assertEquals(audioDisc.getArtist(), "Rush");
				break;
			case "VideoDisc":
				VideoDisc3 videoDisc = (VideoDisc3) d;
				assertEquals(videoDisc.getDirector(), "Mel Brooks");
				break;
			}
		}*/
		tx.commit();
		session.close();
	}

}
