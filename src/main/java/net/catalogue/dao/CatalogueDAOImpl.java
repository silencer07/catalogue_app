package net.catalogue.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import net.catalogue.dao.CatalogueDAO;

import net.catalogue.form.Apparel;

@Repository
public class CatalogueDAOImpl implements CatalogueDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(CatalogueDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addApparel(Apparel a) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Apparel saved successfully, Apparel Details="+a);
	}

	@Override
	public void updateApparel(Apparel a) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(a);
		logger.info("Apparel updated successfully, Apparel Details="+a);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Apparel> listApparels() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Apparel> apparelsList = session.createQuery("from Apparel").list();
		for(Apparel a : apparelsList){
			logger.info("Apparel List::"+a);
		}
		return apparelsList;
	}

	@Override
	public Apparel getApparelById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Apparel a = (Apparel) session.load(Apparel.class, new Integer(id));
		logger.info("Apparel loaded successfully, Apparel details="+a);
		return a;
	}

	@Override
	public void removeApparel(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Apparel a = (Apparel) session.load(Apparel.class, new Integer(id));
		if(null != a){
			session.delete(a);
		}
		logger.info("Apparel deleted successfully, apparel details="+a);
	}

}