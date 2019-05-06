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
		
	if (m.tenu.nom =="vide" && invnombre[n]>1 && inventaire[n].nom!="vide") {
		int nb =invnombre[n]/2;
		invnombre[n] = nb;
		
		m.tien(inventaire[n]);
			
		m.nbobjtenu=nb;
	}
	

	
	else if (m.tenu.nom == inventaire[n].nom) {
		invnombre[n]++;
		m.tenu = new Objets("vide",false,0);
		m.nbobjtenu --;
	}

	else if ( m.tenu.nom ==inventaire[n].nom && invnombre[n]>1)  {
		m.nbobjtenu--;
		invnombre[n]++;
		
		
	}
	else if (inventaire[n].nom=="vide" && m.tenu.nom!="vide") {
		if(m.nbobjtenu>1) {
			m.nbobjtenu--;
			inventaire[n]=m.tenu;
			invnombre[n]=1;
			
		}
		
		else {
			Objets tampon = m.tenu;
			m.tien(inventaire[n]);
			inventaire[n]= tampon;
			int nbtampon = m.nbobjtenu;
			m.nbobjtenu = invnombre[n];
			invnombre[n]= nbtampon;
			
		}
		
	}
	else if ( m.tenu.nom !="vide" && m.nbobjtenu ==1 && inventaire[n].nom =="vide")  {
		Objets tampon = m.tenu;
		m.tien(inventaire[n]);
		inventaire[n]= tampon;
		int nbtampon = m.nbobjtenu;
		m.nbobjtenu = invnombre[n];
		invnombre[n]= nbtampon;
	}
	}
	
	public void remplace(int n) {
		if (invnombre[n]==0) {
			inventaire[n]=new Objets("vide",false,0);
		}
		
		
	}
	
	public void dans_la_main(Objets n) {

		
		m.tenu=n;
		m.nbobjtenu=1;
	}
}