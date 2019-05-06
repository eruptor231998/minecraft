import java.util.Hashtable;

public class Liste_Objet<K, V> extends Hashtable<Integer, Objets> {
	

	public Liste_Objet()
	{
		this.put(0,new Objets("vide",false,0));
		this.put(1,new Objets("planche",true,1));
		this.put(2,new Objets("bois",true,2));
		this.put(3,new Objets("baton",true,3));
		this.put(4,new Objets("charbon",true,4));
		this.put(5,new Objets("torche",true,5));
		this.put(6,new Objets("établit",true,6));
		this.put(7,new Objets("coffre",true,7));
		this.put(8,new Objets("four",true,8));
		this.put(9,new Objets("pierre",true,9));
		this.put(10,new Objets("echelle",true,10));
		this.put(11,new Objets("barierre",true,11));
		this.put(12,new Objets("bateau",true,12));
		this.put(13,new Objets("dalle",true,13));
		this.put(14,new Objets("porte",true,14));
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
