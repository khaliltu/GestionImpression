package tn.iit.impression.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tn.iit.impression.configs.HibernateUtil;
import tn.iit.impression.idao.MatiereIDao;
import tn.iit.impression.models.Matiere;

public class MatiereDao implements MatiereIDao {

	public void save(Matiere matiere) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.persist(matiere);
		trx.commit();
	}

	@Override
	public void delete(Matiere matiere) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.delete(matiere);
		trx.commit();
	}

	@Override
	public void update(Matiere matiere) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.merge(matiere);
		trx.commit();
	}

	@Override
	public List<Matiere> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Matiere m");
		List<Matiere> listMatiere = query.getResultList();
		return listMatiere;
	}

	@Override
	public Matiere findById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Matiere m WHERE m.id=:id");
		query.setParameter("id", id);
		List<Matiere> listMatiere = query.getResultList();
		if (!listMatiere.isEmpty())
			return listMatiere.get(0);
		return null;
	}

}
