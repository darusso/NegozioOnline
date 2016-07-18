
/**
 * Aggiungi qui una descrizione della classe Prodotto
 * 
 * @author Davide
 * @version 0.1
 */
public class Prodotto
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private String codice;
    private String desc;
    private double prezzo;

    

    /**
     * Costruttore degli oggetti di classe  Prodotto
     */
    public Prodotto(String codice, String desc, double prezzo)
    {
        // inizializza le variabili d'istanza
        this.codice = codice;
        this.desc = desc;
        this.prezzo = prezzo;
    }

    /**
     * Metodo ottieniCodice
     * 
     * @param  
     * @return     codice del prodotto
     */
    public String ottieniCodice()
    {
        // metti qui il tuo codice
        return this.codice;
    }
    
    /**
     * Metodo ottieniDescrizione
     * 
     * @param  
     * @return     la descrizione del prodotto
     */
    public String ottieniDescrizione()
    {
        // metti qui il tuo codice
        return this.desc;
    }
    
    /**
     * Metodo ottieniPrezzo
     * 
     * @param  
     * @return     il prezzo del prodotto
     */
    public double ottieniPrezzo()
    {
        // metti qui il tuo codice
        return this.prezzo;
    }
}
