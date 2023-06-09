package esercizio4.fumetteria;

public class Fumetto extends Libro{
	private String nome;
	private String disegnatore;
	

	public Fumetto(String titolo, String autore, int annoDiPubblicazione, double costo,
			String editore, String nome, String disegnatore) {
		super(titolo, autore, annoDiPubblicazione, costo, editore);
		this.nome = nome;
		this.disegnatore = disegnatore;
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDisegnatore() {
		return disegnatore;
	}


	public void setDisegnatore(String disegnatore) {
		this.disegnatore = disegnatore;
	}


	@Override
	public String toString() {
		return "Fumetto [nome=" + nome + ", disegnatore=" + disegnatore + ", Titolo=" + getTitolo()
				+ ", Autore=" + getAutore() + ", Anno di pubblicazione=" + getAnnoDiPubblicazione()
				+ ", Costo=" + getCosto() + ", Editore=" + getEditore() + "]\n";
	}
	
	
	
}
