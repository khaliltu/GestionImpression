package tn.iit.impression.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tn.iit.impression.configs.HibernateUtil;
import tn.iit.impression.idao.DemandeIDao;
import tn.iit.impression.models.Demande;

public class DemandeDao implements DemandeIDao {

	public void save(Demande demande) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.persist(demande);
		trx.commit();
	}

	@Override
	public void delete(Demande demande) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.delete(demande);
		trx.commit();
	}

	@Override
	public void update(Demande demande) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.merge(demande);
		trx.commit();
	}

	@Override
	public List<Demande> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Demande d");
		List<Demande> listDemande = query.getResultList();
		return listDemande;
	}

	@Override
	public Demande findById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Demande d WHERE d.id=:id");
		query.setParameter("id", id);
		List<Demande> listDemande = query.getResultList();
		if (!listDemande.isEmpty())
			return listDemande.get(0);
		return null;
	}

}
