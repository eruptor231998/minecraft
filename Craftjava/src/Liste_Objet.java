import java.util.Hashtable;

public class Liste_Objet<K, V> extends Hashtable<Integer, Objets> {

	public Liste_Objet()
	{
		this.put(0,new Objets("vide",1,false,0));
		this.put(1,new Objets("planche",1,true,1));
		this.put(2,new Objets("bois",1,true,2));
		this.put(3,new Objets("baton",1,true,3));
		this.put(4,new Objets("charbon",1,true,4));
		this.put(5,new Objets("torche",1,true,5));
		this.put(6,new Objets("établit",1,true,6));
		this.put(7,new Objets("coffre",1,true,7));
		this.put(8,new Objets("four",1,true,8));
		this.put(9,new Objets("pierre",1,true,9));
		this.put(10,new Objets("echelle",1,true,10));
		this.put(11,new Objets("barierre",1,true,11));
		this.put(12,new Objets("bateau",1,true,12));
		this.put(13,new Objets("dalle",1,true,13));
		this.put(14,new Objets("porte",1,true,14));

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
