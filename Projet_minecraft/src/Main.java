public class Main {

	Objets tenu;
	int nbobjtenu = 0;

	public Main() {
		tenu = (new Objets("main",false,0));//créer une main avec un objet inexistant
	}
	public void tien (Objets obj) {
		this.tenu = obj;
	}
}
