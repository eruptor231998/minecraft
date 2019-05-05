public class Inventaire {
	Objets[] inventaire = new Objets[73];
	Integer[] invnombre = new Integer[73];
	Main m = new Main();

	public Inventaire() {
		for(int i =0; i<73 ; i++) {
			this.inventaire[i] = new Objets("vide",false,0);
			this.invnombre[i] = 1;
		}
	}

	public void echange(int n) { //prend la pile entiere clic gauche

		if (m.tenu.nom != inventaire[n].nom) {
		Objets tampon = m.tenu;
		m.tien(inventaire[n]);
		inventaire[n]= tampon;
		int nbtampon = m.nbobjtenu;
		m.nbobjtenu = invnombre[n];
		invnombre[n]= nbtampon;
		}
		else {
			m.tenu = new Objets("vide",false,0);
			invnombre[n]+=m.nbobjtenu;
			m.nbobjtenu = 0;
		}

	}

	public void select_un(int  n) { //prend un element clic droit

	if (m.tenu.nom =="vide" && invnombre[n]>1 ) {
		invnombre[n] = invnombre[n]/2;
		Objets tampon = m.tenu;
		m.tien(inventaire[n]);
		inventaire[n]= tampon;
	}

	else if (m.tenu.nom == inventaire[n].nom) {
		invnombre[n]++;
		m.tenu = new Objets("vide",false,0);
		m.nbobjtenu = 0;
	}

	else if ( m.tenu.nom =="vide")  {
		Objets tampon = m.tenu;
		m.tien(inventaire[n]);
		inventaire[n]= tampon;
		int nbtampon = m.nbobjtenu;
		m.nbobjtenu = invnombre[n];
		invnombre[n]= nbtampon;
	}
	}

	public void echange_entre(int n,int m) {

		Objets y =inventaire[m];
		Objets z=inventaire[n];
		int nby=invnombre[m];
		int nbz=invnombre[n];

		inventaire[n]=y;
		inventaire[m]=z;
		invnombre[n]=nby;
		invnombre[m]=nbz;

	}

	public void dans_la_main(Objets n) {


		m.tenu=n;
		m.nbobjtenu=1;
	}
}
