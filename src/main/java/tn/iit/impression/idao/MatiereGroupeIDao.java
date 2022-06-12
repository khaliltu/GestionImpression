package tn.iit.impression.idao;

import java.util.List;

import tn.iit.impression.models.MatiereGroupe;

public interface MatiereGroupeIDao {

	void save(MatiereGroupe matiereGroupe);

	void delete(MatiereGroupe matiereGroupe);

	void update(MatiereGroupe matiereGroupe);

	List<MatiereGroupe> getAll();

	MatiereGroupe findById(int id);
}
