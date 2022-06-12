package tn.iit.impression.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tn.iit.impression.configs.HibernateUtil;
import tn.iit.impression.idao.UtilisateurIDao;
import tn.iit.impression.models.Utilisateur;

public class UtilisateurDao implements UtilisateurIDao {

	public void save(Utilisateur user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.persist(user);
		trx.commit();
	}

	@Override
	public void delete(Utilisateur user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.delete(user);
		trx.commit();
	}

	@Override
	public void update(Utilisateur user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		session.merge(user);
		trx.commit();
	}

	@Override
	public List<Utilisateur> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Utilisateur u");
		List<Utilisateur> listUser = query.getResultList();
		return listUser;
	}

	@Override
	public Utilisateur findByLoginPassword(String login, String password) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM utilisateur u WHERE u.login=:log and u.password=:pwd");
		query.setParameter("log", login).setParameter("pwd", password);
		List<Utilisateur> listUser = query.getResultList();
		if (!listUser.isEmpty())
			return listUser.get(0);
		return null;
	}

}
