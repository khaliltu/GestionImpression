package tn.iit.impression.idao;

import java.util.List;

import tn.iit.impression.models.Matiere;

public interface MatiereIDao {

	void save(Matiere matiere);

	void delete(Matiere matiere);

	void update(Matiere matiere);

	List<Matiere> getAll();

	Matiere findById(int id);
}
