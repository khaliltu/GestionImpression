package tn.iit.impression.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.iit.impression.models.enums.Role;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String login;
	private String password;
	private Role role;
	@ManyToOne
	private List<MatiereGroupe> listMatiereGroupe;

}
