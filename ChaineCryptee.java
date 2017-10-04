
/**
 * DÃ©crivez votre classe ChaineCryptee ici.
 *
 * @author (votre nom)
 * @version (un numÃ©ro de version ou une date)
 */
public class ChaineCryptee
{
    // variables d'instance - remplacez l'exemple qui suit par le vÃ´tre
    private String crypte;
    private int decalage;

    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    private ChaineCryptee(String clair, int decalage)
    {
        // initialisation des variables d'instance
        StringBuilder str = new StringBuilder();
        int i;
        
        if(clair != null) {
            for(i = 0; i < clair.length(); i++) {
                str.append(decaleCaractere(clair.toUpperCase().charAt(i), decalage));
            }
        }
        this.crypte = str.toString();
        this.decalage = decalage;
    }
    
    public static ChaineCryptee FromCrypted(String crypte, int decalage) { 
        
        StringBuilder str = new StringBuilder();
        int i;
        
        if(crypte != null) {
            for(i = 0; i < crypte.length(); i++) {
                str.append(decaleCaractere(crypte.toUpperCase().charAt(i), - decalage));
            }
        }
        ChaineCryptee ch = new ChaineCryptee(str.toString(), decalage);
        return ch;
    }
    
    public static ChaineCryptee FromDecrypted(String clair, int decalage) {
        ChaineCryptee ch = new ChaineCryptee(clair, decalage);
        return ch;
    }

    /**
     * @return     la chaine en clair, null si chaine de caractere initialisÃ©e Ã  null
     */
    public String decrypte()
    {
        StringBuilder str = new StringBuilder();
        int i;
        
        for(i = 0; i < crypte.length(); i++) {
            str.append(decaleCaractere(crypte.toUpperCase().charAt(i), - decalage));
        }
        return str.toString();
    }
    
    
    private static char decaleCaractere(char c, int decalage) {
            return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage) % 26) + 'A');
    }
    
    /**
     * @return      retourne la chaine cryptÃ©e, ou la chaine vide si la chaine en clair est "null"
     */
    public String crypte()
    {
        // InsÃ©rez votre code ici
        return crypte;
    }
}