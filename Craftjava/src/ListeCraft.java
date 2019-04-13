import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class ListeCraft<k,v> extends HashMap<String, Objets > {
	
	

	
	public ListeCraft(Liste_Objet<Integer, Objets> liste) {
		
		Objets bois =  liste.get(1);
		bois.nombre = 4;
		this.put("0,0,0,0,2,0,0,0,0",bois);

		Objets feu =  liste.get(3);
		feu.nombre = 4;

		this.put("0,0,0,0,1,0,0,1,0",feu);
		Objets planche =  liste.get(5);
		planche.nombre = 4;
		
		this.put("0,0,0,0,4,0,0,3,0",planche);
	}

}
