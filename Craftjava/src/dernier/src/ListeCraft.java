import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class ListeCraft<k,v> extends HashMap<String, Objets > {
	
	

	
	public ListeCraft(Liste_Objet<Integer, Objets> list) {
		
		Objets ob = (Objets) list.get(1); //planche
		//ob.nombre = 4;
		this.put("000020000",ob);

		ob = (Objets) list.get(3); //baton
		//ob.nombre = 4;
		this.put("000010010",ob);

		ob = (Objets) list.get(5); //torche
		//ob.nombre = 4;
		this.put("000040030",ob);

		ob = (Objets) list.get(6); //�tablit
		//ob.nombre = 1;
		this.put("000110110",ob);

		ob = (Objets) list.get(7); //coffre
		//ob.nombre = 1;
		this.put("111101111",ob);

		ob = (Objets) list.get(8); //four
		//ob.nombre = 1;
		this.put("999909999",ob);

		ob = (Objets) list.get(10); //�chelle
		//ob.nombre = 10;
		this.put("303333303",ob);

		ob = (Objets) list.get(11); //barri�re
		//ob.nombre = 3;
		this.put("000232232",ob);

		ob = (Objets) list.get(13); //dalle
		//ob.nombre = 6;
		this.put("000000111",ob);

		ob = (Objets) list.get(12); //bateau
		//ob.nombre = 1;
		this.put("000101111",ob);

		ob = (Objets) list.get(14); //porte
		//ob.nombre = 3;
		this.put("110110110",ob);
}

}