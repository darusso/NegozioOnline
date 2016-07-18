package myShop;

public class ProdottoSelezionato extends Prodotto {
    
    public int quantitaSelezionata;

    public ProdottoSelezionato(int id, String nome, String descrizione, double prezzo, int qS) {
        super(id, nome, descrizione, prezzo);
        this.quantitaSelezionata = qS;
    }
    
}