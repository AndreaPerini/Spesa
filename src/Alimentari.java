import java.time.LocalDate;

public class Alimentari extends Prodotto {

	private LocalDate scadenza;

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
	
	
}
