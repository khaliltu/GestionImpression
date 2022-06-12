package tn.iit.impression.idao;

import java.util.List;

import tn.iit.impression.models.Groupe;

public interface GroupeIDao {
	
	void save(Groupe groupe);

	void delete(Groupe groupe);

	void update(Groupe groupe);

	List<Groupe> getAll();

	Groupe findById(int id);
}
