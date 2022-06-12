package tn.iit.impression.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Demande {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date dateLimite;
	private int nbCopie;
	@OneToMany
	private MatiereGroupe matiereGroupe;
}
