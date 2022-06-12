package tn.iit.impression.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class MatiereGroupe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int semestre;
	private int coefficient;
	@OneToMany
	private Matiere matiere;
	@OneToMany
	private Groupe groupe;
	@OneToMany
	private Utilisateur enseignant;
	@ManyToOne
	private List<Demande> listDemande;
}
