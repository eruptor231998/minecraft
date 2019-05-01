import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//PB:
/*
Quand on a plusieurs objets, on peut les dï¿½placer dans l'inventaire mais si l'on veut
en dï¿½placer un dans la combinaison, on a un problï¿½me d'affichage pour les autres.



*/
public class C1 extends JPanel implements ActionListener,WindowListener,MouseListener {

	static Image img=new ImageIcon("wallpaper.png").getImage();

	static Image image2=new ImageIcon("wood1.png").getImage();
	static Image image1=new ImageIcon("wood.png").getImage();
	static Image image5=new ImageIcon("torch.png").getImage();
	static Image image3=new ImageIcon("stick.png").getImage();
	static Image image4=new ImageIcon("Charbon.png").getImage();

	static Image image12=new ImageIcon("boat.png").getImage();
	static Image image9=new ImageIcon("Pierres.png").getImage();
	static Image image8=new ImageIcon("Furnace.png").getImage();
	static Image image6=new ImageIcon("workbench.png").getImage();
	static Image image13=new ImageIcon("wooden_slabs.png").getImage();
	static Image image7=new ImageIcon("chest.png").getImage();
	static Image image14=new ImageIcon("door.png").getImage();
	static Image image10=new ImageIcon("Echelle.png").getImage();
	static Image image11=new ImageIcon("fence.png").getImage();

	static Image[] tableauImg = {null,image1,image2,image3,image4,image5,image6,image7,image8,image10,image11,image12,image13,image14};
	static Inventaire inv = new Inventaire();
	static Liste_Objet<Integer, Objets> obj = new Liste_Objet<Integer, Objets>();

	static int x=0;
	static int y=0;

    Integer[] matrice= {0,0,0,0,0,0,0,0,0};

	ListeCraft<Integer[][], Objets > recette = new ListeCraft<Integer[][], Objets >(obj);

	public static void main(String args[]) {
		C1 c = new C1();
		Frame f = new Frame();
		f.setSize(1175,625);
		f.addWindowListener(c);
		c.addMouseListener(c);
		JButton bt1 = new JButton("Craft");
        bt1.setBounds(725,180,75,50);
        f.add(bt1);
        bt1.addActionListener(c);
        JButton bt2 = new JButton("Reset");
        bt2.setBounds(10,35,75,50);
        f.add(bt2);
        f.add(c);
        bt2.addActionListener(c);
		f.setTitle("Minecraft-master");
		f.setVisible(true);
		for (int i=1; i<tableauImg.length;i++) {
		inv.inventaire[i+9] = (Objets) obj.get(i);}


	}

	public void paint(Graphics g) {
		Color c = Color.GRAY;
		Color d=Color.white;
		// fond d'ï¿½cran
		g.drawImage(img, 0,0,null);

		//Bloc du rï¿½sultat
		g.setColor(c);
		g.fillRect(650,150, 50, 50);
		g.setColor(d);
		g.drawRect(650,150, 50, 50);
		String rec="";
		for (int t=0;t<matrice.length;t++) {
			if (t<matrice.length-1) {
				rec+= Integer.toString(matrice[t])+",";

			}
			else {
				rec+= Integer.toString(matrice[t]);
			}
		}
		if (recette.containsKey(rec)) {
		Objets resultat= recette.get(rec);
		g.drawImage(tableauImg[resultat.image],650, 150,null);
		for (int b=0;b<matrice.length;b++) {
			if (matrice[b]!=0) {
				matrice[b]=0;
			}
		}

		}




		//Bloc des combinaisons
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				g.setColor(c);
				g.fillRect(400+(j*50),100+(i*50), 50, 50);
				//g.drawImage(image,400+(j*50) ,100+(i*50),null);
				g.setColor(d);
				g.drawRect(400+(j*50),100+(i*50), 50, 50);
			}
		}

		//Bloc des ressources
		int j=0;
		while (j <=2) {
		for (int i=1; i<22; i++) {
			g.setColor(c);
			g.fillRect(i*50, 400+(j*50), 50, 50);
			g.setColor(d);
			g.drawRect(i*50, 400+(j*50), 50, 50);
		}
		j+=1;
		}
		for (int n=0; n < inv.inventaire.length ; n++) {
			if (inv.inventaire[n].plein==true) {
				//dans l'inventaire
				if (n>9) {
					int x =(((n-10)%21)*50);
					int y =400+(50*((n-10)/21));
					g.drawImage(tableauImg[inv.inventaire[n].image],50+x, y,null);
					g.drawString(String.valueOf(inv.inventaire[n].nombre), 50+x+40, y+45);
					}

				//dans les combinaisons
				if (n<=9) {
					int x = 350+((n-1)%3)*50;
					int y = 100+(50*((n-1)/3));
					g.drawImage(tableauImg[inv.inventaire[n].image],50+x, y,null);
					g.drawString(String.valueOf(inv.inventaire[n].nombre), 50+x+40, y+45);

					int i=(y/50)-2;
					int jj=(x/50)-7;

					int place=(i*3)+jj;

					matrice[place]=inv.inventaire[n].image;


					for (int k=0;k<matrice.length;k++) {

							System.out.print(matrice[k]);
					//repaint();





					}

				}

			}
		}






	}

	private String Str(int nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub



	}

	@Override
	public void mousePressed(MouseEvent e) {
		int buttonDown = e.getButton();

	 	if (buttonDown == MouseEvent.BUTTON1) {
		           // Bouton GAUCHE enfonc銉 		System.out.println("clique gauche");

	    } else if(buttonDown == MouseEvent.BUTTON3) {
				x=e.getX();
				 y=e.getY();

				 if ((x<550 && x>400)&&(100<y && y<250)) {
					 int i=(y/50);
					 int j=(x/50);

					 int n=((i*3)+j)-13;

					 System.out.println("Combinaison : "+n);

				 inv.echange(n);
				 repaint();
				 }

				 if ((x<1100 && x>50)&&(400<y && y<550)) {
					 int i=(y/50)-8;
					 int j=(x/50);

					 int n=((i*21)+j);

					 System.out.println("Ressource : "+n);


				 inv.echange(n+9);
				 repaint();
				 }

		    }

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String com = e.getActionCommand(); //le bouton sélectionné
		System.out.println("Action sur le composant : " + com);

		if (com=="Craft") {
		System.out.println("ok");
		repaint();}

		if (com=="Reset") {
		System.out.println("ok1");
		}

	}


}
