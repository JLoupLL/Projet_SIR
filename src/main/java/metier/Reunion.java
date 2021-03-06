package metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
public class Reunion {

	private long idReunion;
	private List<Sondage> listeSondages=new ArrayList<Sondage>();
	
	private List<Utilisateur> listeUtilisateurs=new ArrayList<Utilisateur>();
	public Reunion(List<Sondage> listeSondages, List<Utilisateur> listeParticipants) {
		super();
		this.listeSondages = listeSondages;
	}
	
	public Reunion() {}
	@Id
	@GeneratedValue
	public long getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(long idReunion) {
		this.idReunion = idReunion;
	}

	@OneToMany(mappedBy="reunionDuSondage" ,cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JsonManagedReference(value = "reunionDuSondage")
	@JsonIgnore
	public List<Sondage> getListeSondages() {
		return listeSondages;
	}

	public void setListeSondages(List<Sondage> listeSondages) {
		this.listeSondages = listeSondages;
	}

	@OneToMany
	@JsonIgnore
	public List<Utilisateur> getListeUtilisateurs() {
		return listeUtilisateurs;
	}

	public void setListeUtilisateurs(List<Utilisateur> listeParticipants) {
		this.listeUtilisateurs = listeParticipants;
	}
	
	
	

	
}
