import java.time.LocalDate;

public class Alimentari extends Prodotto {

	private LocalDate scadenza;
	private static int indiceStampa = 0;
	private static int stampare[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	
	
	public LocalDate getScadenza() {
		return scadenza;
	}

	public void setScadenza(LocalDate scadenza) {
		this.scadenza = scadenza;
	}

	public Alimentari(float prezzo, LocalDate scadenza) {
		super(prezzo);
		this.scadenza = scadenza;
	}

	public Alimentari(float prezzo) {
		super(prezzo);
	}

	public static void elenco() {
		for (int i = 0; i < indiceStampa; i++) {
			System.out.println("- " + prodotti[stampare[i]]);
		}
	}

	public void aggiungiAlloScaffale(Alimentari prodotto) {
		if (getIndice() <= 9) {
			prodotti[getIndice()] = prodotto;
			setIndice(getIndice() + 1);
			stampare [indiceStampa] = getIndice();
			indiceStampa++;
		} else {
			System.out.println("Scaffale pieno");
		}
	}
}
