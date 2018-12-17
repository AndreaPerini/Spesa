
public class Prodotto {

	String nome;
	private float prezzo;
	Prodotto[] prodotti = new Prodotto[10];

	public Prodotto(float prezzo) {
		super();
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public void elenco() {
		for (int i = 0; i < 10; i++) {
			System.out.println("- " + prodotti[i]);
		}
	}

}
