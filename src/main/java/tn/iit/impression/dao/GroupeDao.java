package tn.iit.impression.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tn.iit.impression.configs.HibernateUtil;
import tn.iit.impression.idao.GroupeIDao;
import tn.iit.impression.models.Groupe;

public class GroupeDao implements GroupeIDao {

	public void save(Groupe gourpe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.persist(gourpe);
		trx.commit();
	}

	@Override
	public void delete(Groupe gourpe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.delete(gourpe);
		trx.commit();
	}

	@Override
	public void update(Groupe gourpe) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.merge(gourpe);
		trx.commit();
	}

	@Override
	public List<Groupe> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Groupe g");
		List<Groupe> listGroupe = query.getResultList();
		return listGroupe;
	}

	@Override
	public Groupe findById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Groupe g WHERE g.id=:id");
		query.setParameter("id", id);
		List<Groupe> listGroupe = query.getResultList();
		if (!listGroupe.isEmpty())
			return listGroupe.get(0);
		return null;
	}

}
