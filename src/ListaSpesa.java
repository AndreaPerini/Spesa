
public class ListaSpesa {

	private Prodotto[] lista = new Prodotto[100];
	private static int index = 0;
	private float totale = 0;

	public void creaLista() {
		for (int i = 0; i < 100; i++) {
			lista[i] = null;
		}
	}

	public void vediLista() {
		for (int i = 0; i <= index; i++) {
			System.out.println("- " + lista[i]);
		}
		System.out.println("Il totale � " + this.totale);
	}

	public void aggiungiProdotto(Prodotto prodotto) {
		lista[index] = prodotto;
		index++;
	}

	public void rimuoviProdotto(String nome) {
		for (int i = 0; i <= index; i++) {
			if (lista[i].nome.equalsIgnoreCase(nome)) {
				lista[i] = null;
				for (int j = i; j <= index; j++) {
					lista[j] = lista[j + 1];
				}
				i = index;
			}
		}
		index--;
	}

}
