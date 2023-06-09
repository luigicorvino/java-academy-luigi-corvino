package esercizio3.implementazione;

import esercizio3.interfaccia.GiocatoreProfessionista;

public class Calciatore implements GiocatoreProfessionista{
	private String nome;
	private String cognome;
	private int annoDiNascita;
	private String luogoDiNascita;
	private String squadra;
	private String ruolo;
	private double costoCartellino;
	private int anniDiContratto;
	private double stipendioAnnuo;
	
	

	public Calciatore(String nome, String cognome, int annoDiNascita, String luogoDiNascita, String squadra,
			String ruolo, double costoCartellino, int anniDiContratto, double stipendioAnnuo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.annoDiNascita = annoDiNascita;
		this.luogoDiNascita = luogoDiNascita;
		this.squadra = squadra;
		this.ruolo = ruolo;
		this.costoCartellino = costoCartellino;
		this.anniDiContratto = anniDiContratto;
		this.stipendioAnnuo = stipendioAnnuo;
	}

	@Override
	public void stampaDati() {
		System.out.println(this);
		
	}

	@Override
	public double calcolaStipendioMensile() {
		// TODO Auto-generated method stub
		return stipendioAnnuo/12;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnnoDiNascita() {
		return annoDiNascita;
	}

	public void setAnnoDiNascita(int annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public double getCostoCartellino() {
		return costoCartellino;
	}

	public void setCostoCartellino(double costoCartellino) {
		this.costoCartellino = costoCartellino;
	}

	public int getAnniDiContratto() {
		return anniDiContratto;
	}

	public void setAnniDiContratto(int anniDiContratto) {
		this.anniDiContratto = anniDiContratto;
	}

	public double getStipendioAnnuo() {
		return stipendioAnnuo;
	}

	public void setStipendioAnnuo(double stipendioAnnuo) {
		this.stipendioAnnuo = stipendioAnnuo;
	}

	@Override
	public String toString() {
		return "Calciatore [nome=" + nome + ", cognome=" + cognome + ", annoDiNascita=" + annoDiNascita
				+ ", luogoDiNascita=" + luogoDiNascita + ", squadra=" + squadra + ", ruolo=" + ruolo
				+ ", costoCartellino=" + costoCartellino + ", anniDiContratto=" + anniDiContratto + ", stipendioAnnuo="
				+ stipendioAnnuo + "]";
	}
	
	
	
	
	
	

}
