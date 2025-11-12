package operation;

import java.util.Arrays;
import java.util.Collections;

import exception.IllegalParamISIExceptions;

public class operationMathematique {
	public boolean estPositif(int nombre) {
	    return nombre > 0;
	}
	public int factoriel(int nombre) throws IllegalParamISIExceptions {
	    if (nombre < 0)
	        throw new IllegalParamISIExceptions("Le factoriel d’un nombre négatif est impossible !");
	    int resultat = 1;
	    for (int i = 1; i <= nombre; i++)
	        resultat *= i;
	    return resultat;
	}

	    
	
	public Integer[] trier(Integer[] liste) {
	    Arrays.sort(liste, Collections.reverseOrder());
	    return liste;
	}
}
