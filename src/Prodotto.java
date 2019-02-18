
public class Prodotto {

	String nome;
	private float prezzo;
	public static Prodotto[] prodotti = new Prodotto[10];
	private int indice = 0;
	
	public Prodotto() {
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public Prodotto(float prezzo) {
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
	
	public static void elenco() {
		for (int i = 0; i < 10; i++) {
			System.out.println("- " + prodotti[i]);
		}
	}
	
}
