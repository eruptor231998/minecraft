
import java.awt.Canvas;
import java.awt.Color;

import java.awt.Frame;
import java.awt.Graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class C1 extends Canvas implements WindowListener,MouseListener{
	static Inventaire inv = new Inventaire();

	public static void main(String args[]) {
		C1 c = new C1();
		Frame f = new Frame();
		f.add(c);
		f.addWindowListener(c);
		c.addMouseListener(c);
		f.setSize(1100,600);
		f.setTitle("Ma  premiere app");
		f.setVisible(true);
		
		inv.inventaire[4] = new Objets("balle rouge",1,true);
		
		//

	}

	public void paint(Graphics g) {
		Color c = Color.GRAY;
		Color d=Color.white;
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
				g.setColor(Color.red);
				int x =(((n-1)%21)*50);
				int y =400+(50*((n-1)/21));
				g.fillOval(50+x+5, y+5, 40, 40);
			}
		}
		
		
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
		int x=e.getX();
	    int y=e.getY();
	    if ((x<1100 && x>50)&&(400<y && y<550)) {
	    	int i=(y/50)-8;
	    	int j=(x/50);
	    	
	    	int n=((i*21)+j);
	    	
	    	inv.echange(n);
	    	System.out.println(n);
	    	repaint();
	    }
	 
	    
	    
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	
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
	

}