package daoInterface;

import java.sql.SQLException;
import java.util.List;

import metier.PreferenceAlimentaire;
import metier.Utilisateur;

public interface UtilisateurDao {
	List<Utilisateur> getListUtilisateur() throws SQLException;
	Utilisateur save(Utilisateur u);
	Utilisateur getUtilisateurByEmail(String mail);
	Utilisateur deleteUser(String mail);
	PreferenceAlimentaire addPreferenceAli(PreferenceAlimentaire p,String mail);
	}
