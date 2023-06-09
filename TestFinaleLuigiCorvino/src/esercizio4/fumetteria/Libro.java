package esercizio4.fumetteria;

public class Libro {
	private String titolo;
	private String autore;
	private int annoDiPubblicazione;
	private double costo;
	private String editore;
	
	public Libro(String titolo, String autore, int annoDiPubblicazione, double costo, String editore) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.annoDiPubblicazione = annoDiPubblicazione;
		this.costo = costo;
		this.editore = editore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}

	public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
		this.annoDiPubblicazione = annoDiPubblicazione;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", anno di pubblicazione=" + annoDiPubblicazione
				+ ", costo=" + costo + ", editore=" + editore + "]";
	}
	
	
	
	
	
	
}
