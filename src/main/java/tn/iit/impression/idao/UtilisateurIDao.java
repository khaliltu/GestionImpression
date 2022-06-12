package tn.iit.impression.idao;

import java.util.List;

import tn.iit.impression.models.Utilisateur;

public interface UtilisateurIDao {

	void save(Utilisateur user);

	void delete(Utilisateur user);

	void update(Utilisateur user);

	List<Utilisateur> getAll();

	Utilisateur findByLoginPassword(String login, String password);
}
