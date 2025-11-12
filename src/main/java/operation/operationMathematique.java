package operation;

public class operationMathematique {
	public boolean estPositif(int nombre) {
	    return nombre > 0;
	}
	public int factoriel(int nombre) {
	    int resultat = 1;
	    for (int i = 1; i <= nombre; i++) {
	        resultat *= i;
	    }
	    return resultat;
	}

}
