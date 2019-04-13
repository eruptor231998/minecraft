public class Inventaire {
	Objets[] inventaire = new Objets[73];
	Main m = new Main();

	public Inventaire() {
		for(int i =0; i<73 ; i++) {
			this.inventaire[i] = new Objets("vide",1,false,0);
		}
	}

	public void echange(int n) { //prend la pile entiere
		Objets tampon = m.tenu;
		m.tien(inventaire[n]);
		inventaire[n]= tampon;
	}

}
