package com.vikas.hibernate.example.chapter4.recipe0;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExecutableClass_tab_per_class {

	public void test() {
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
		session=SessionManager.openSession();
		tx=session.beginTransaction();
		Disc disc1= (Disc) session.load(Disc.class, disc.getId());
		if(disc1!=null && disc1.getName().equals(disc.getName())) {
			System.out.println("Discs are Equal !!!!!!!!!!!!");
		} else {
			System.out.println("Discs are not eqal @@@@@@@@@@@");
		}
		VideoDisc videoDisc2= (VideoDisc) session.load(VideoDisc.class, videoDisc.getId());
		if(videoDisc2!=null && videoDisc2.getName().equals(videoDisc.getName())) {
			System.out.println("Video Discs are Equal !!!!!!!!!!!!");
		} else {
			System.out.println("Video Discs are not eqal @@@@@@@@@@@");
		}
		tx.commit();
		session.close();
	}

}
