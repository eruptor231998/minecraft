
public class Inventaire {
	Objets[] inventaire = new Objets[64];
	Main m = new Main();
	
	public Inventaire() {
		for(int i =0; i<64 ; i++) {
			this.inventaire[i] = new Objets("vide",1,false);
		}
	}
	
	public void echange(int n) { //prend la pile entiere
		Objets tampon = m.tenu;
		m.tien(inventaire[n]);
		inventaire[n]= tampon;
	}

}
