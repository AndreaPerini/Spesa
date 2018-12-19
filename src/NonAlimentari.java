
public class NonAlimentari extends Prodotto {

	private String materiale;
	private static int indiceStampa = 0;
	private static int stampare[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public NonAlimentari(float prezzo, String materiale) {
		super(prezzo);
		this.materiale = materiale;
	}
	
	public static void elenco() {
		for (int i = 0; i < indiceStampa; i++) {
			System.out.println("- " + prodotti[stampare[i]]);
		}
	}

	public void aggiungiAlloScaffale(NonAlimentari prodotto) {
		if (getIndice() <= 9) {
			prodotti[getIndice()] = prodotto;
			setIndice(getIndice() + 1);
			stampare[indiceStampa] = getIndice();
			indiceStampa++;
		} else {
			System.out.println("Scaffale pieno");
		}
	}

}
