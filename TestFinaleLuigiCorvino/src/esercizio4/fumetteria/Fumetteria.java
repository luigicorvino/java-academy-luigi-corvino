package esercizio4.fumetteria;

public class Fumetteria {
	private String nome;
	private String via;
	private String titolare;
	private int numeroFumettiMassimi;
	private Fumetto[] fumetti;

	public Fumetteria(String nome, String via, String titolare, int numeroFumettiMassimi, Fumetto[] fumetti) {
		super();
		if(fumetti.length > numeroFumettiMassimi)
			throw new IllegalArgumentException("Il numero di fumetti è maggiore della soglia massima");
		this.nome = nome;
		this.via = via;
		this.titolare = titolare;
		this.numeroFumettiMassimi = numeroFumettiMassimi;
		this.fumetti = fumetti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}

	public int getNumeroFumettiMassimi() {
		return numeroFumettiMassimi;
	}

	public void setNumeroFumettiMassimi(int numeroFumettiMassimi) {
		if(fumetti.length > numeroFumettiMassimi)
			throw new IllegalArgumentException("Il numero di fumetti è maggiore della soglia massima");
		this.numeroFumettiMassimi = numeroFumettiMassimi;
	}

	public Fumetto[] getFumetti() {
		return fumetti;
	}

	public void setFumetti(Fumetto[] fumetti) {
		if(fumetti.length > numeroFumettiMassimi)
			throw new IllegalArgumentException("Il numero di fumetti è maggiore della soglia massima");
		this.fumetti = fumetti;
	}


	public void stampaDati() {
		System.out.println(this);
		System.out.println("Lista fumetti: ");
		for(int i=0; i<fumetti.length;i++) {
			System.out.println(i+1+")"+fumetti[i]);
		}
	}

	@Override
	public String toString() {
		return "Fumetteria [nome=" + nome + ", via=" + via + ", titolare=" + titolare + ", numeroFumettiMassimi="
				+ numeroFumettiMassimi;
	}



}
