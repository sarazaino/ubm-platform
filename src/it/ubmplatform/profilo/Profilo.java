package it.ubmplatform.profilo;

/**
 * Bean Profilo che rappresenta il profilo all'interno del sistema
 * Esso contiene tutte le informazioni relative al profilo
 * @author Marco
 *
 */
public class Profilo {
	/**
	 * Crea un nuovo profilo con le info associate
	 * @param newEmail L'email dell'utente a cui � associato il profilo
	 * @param name Il nome dell'utente a cui � associato il profilo
	 * @param surname Il cognome dell'utente a cui � associato il profilo
	 * @param residence La residenza dell'utente a cui � associato il profilo
	 * @param phone Il telefono dell'utente a cui � associato il profilo
	 * @param interest I vari interessi dell'utente a cui � associato il profilo
	 * @param photo La foto dell'utente a cui � associato il profilo
	 */
	public Profilo(String newEmail, String name, String surname, String residence, String phone, String interest, String photo){
		email = newEmail;
		nome = name;
		cognome = surname;
		residenza = residence;
		telefono = phone;
		interessi = interest;
		foto = photo;
	}
	
	

	String getFoto() {
		return foto;
	}
	
	String getEmail() {
		return email;
	}
	
	String getNome() {
		return nome;
	}
	
	String getCognome() {
		return cognome;
	}
	
	String getResidenza() {
		return residenza;
	}
	
	String getTelefono() {
		return telefono;
	}
	
	String getInteressi() {
		return interessi;
	}

	

	void setFoto(String foto) {
		this.foto = foto;
	}



	void setResidenza(String residenza) {
		this.residenza = residenza;
	}



	void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	void setInteressi(String interessi) {
		this.interessi = interessi;
	}



	/**
	 * L'attributo foto
	 */
	private String foto;
	private String email, nome, cognome, residenza, telefono, interessi;

}
