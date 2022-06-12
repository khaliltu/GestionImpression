package tn.iit.impression.idao;

import java.util.List;

import tn.iit.impression.models.Demande;

public interface DemandeIDao {
	
	void save(Demande demande);

	void delete(Demande demande);

	void update(Demande demande);

	List<Demande> getAll();

	Demande findById(int id);
}
