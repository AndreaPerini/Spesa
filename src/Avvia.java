import java.time.LocalDate;
import java.util.*;
public class Avvia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alimentari prodottoa = null;
		NonAlimentari n, prodotton = null;
		ListaSpesa l = null;
		int anno, mese, giorno;
		boolean termina = false;
		String nome;
		System.out.println("Inserisci gli elementi dello scaffale");
		for(int i=0; i<10; i++) {
			System.out.println("Il prodotto è un alimentare?");
			if(sc.next().equalsIgnoreCase("si")) {
				System.out.println("Inserisci il nome del prodotto");
				prodottoa.setNome(sc.next());
				System.out.println("Inserisci il prezzo");
				prodottoa.setPrezzo(sc.nextFloat());
				System.out.println("Inserisci una scadenza");
				System.out.println("Anno: ");
				anno = sc.nextInt();
				System.out.println("Mese: ");
				mese = sc.nextInt();
				System.out.println("Giorno: ");
				giorno = sc.nextInt();
				prodottoa.setScadenza(LocalDate.of(anno, mese, giorno));
				prodottoa.aggiungiAlloScaffale(prodottoa);
				System.out.println("Vuoi aggiungere altri prodotti identici?");
				if(sc.next().equalsIgnoreCase("si")) {
					System.out.println("Quanti ne vuoi aggiungere?");
					for(int j=0; j<sc.nextInt(); j++) {
						prodottoa.aggiungiAlloScaffale(prodottoa);
					}
				}
			}
			else {
				System.out.println("Inserisci il nome del prodotto");
				prodotton.setNome(sc.next());
				System.out.println("Inserisci il prezzo");
				prodotton.setPrezzo(sc.nextFloat());
				System.out.println("Inserisci il materiale");
				prodotton.setMateriale(sc.next());
				prodotton.aggiungiAlloScaffale(prodotton);
				System.out.println("Vuoi aggiungere altri prodotti identici?");
				if(sc.next().equalsIgnoreCase("si")) {
					System.out.println("Quanti ne vuoi aggiungere?");
					for(int j=0; j<sc.nextInt(); j++) {
						prodotton.aggiungiAlloScaffale(prodotton);
					}
				}
			}
		}
		do {
		System.out.println("Scegli cosa fare:\n1-Aggiungi un prodotto al carrello\n2-Rimuovi un prodotto dal carrello\n3-Vedi il carrello\nQualsiasi altro numero per pagare e terminare la spesa");
		switch(sc.nextInt()) {
		case 1:
			Prodotto.elenco();
			System.out.println("Inserisci il nome del prodotto da aggiungere al carrello");
			nome = sc.next();
			for(int i=0; i<10; i++) {
				if(Prodotto.prodotti[i].nome.equalsIgnoreCase("nome")) {
					l.aggiungiProdotto(Prodotto.prodotti[i]);
					i=10;
				}
			}
			break;
		case 2:
			System.out.println("Inserisci il nome del prodotto da rimuovere");
			l.rimuoviProdotto(sc.next());
			break;
		case 3:
			l.vediLista();
			break;
		default:
			System.out.println("Il totale è di " + l.getTotale());
			termina = true;
		}}while(termina = false);
		System.out.println("Grazie per aver fatto la spesa da noi");
	}

}