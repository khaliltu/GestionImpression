package tn.iit.impression.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tn.iit.impression.configs.HibernateUtil;
import tn.iit.impression.idao.MatiereGroupeIDao;
import tn.iit.impression.models.MatiereGroupe;

public class MatiereGroupeDao implements MatiereGroupeIDao {

	public void save(MatiereGroupe matiereGroupe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.persist(matiereGroupe);
		trx.commit();
	}

	@Override
	public void delete(MatiereGroupe matiereGroupe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.delete(matiereGroupe);
		trx.commit();
	}

	@Override
	public void update(MatiereGroupe matiereGroupe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.merge(matiereGroupe);
		trx.commit();
	}

	@Override
	public List<MatiereGroupe> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM MatiereGroupe m");
		List<MatiereGroupe> listMatiereGroupe = query.getResultList();
		return listMatiereGroupe;
	}

	@Override
	public MatiereGroupe findById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM MatiereGroupe m WHERE m.id=:id");
		query.setParameter("id", id);
		List<MatiereGroupe> listMatiereGroupe = query.getResultList();
		if (!listMatiereGroupe.isEmpty())
			return listMatiereGroupe.get(0);
		return null;
	}

}
