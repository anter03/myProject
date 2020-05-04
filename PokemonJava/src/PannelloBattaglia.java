import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.*;

public class PannelloBattaglia extends JPanel implements ActionListener {

	private int w, h,w1,h1;
	private javax.swing.Timer tP, tP1,tT,tT1;
	private ImageIcon pikachu,squirtle,tuonoIcon;
	private boolean vediTuono;
	private JLabel tuono;
	

	public PannelloBattaglia() {
	
		setBackground(Color.white);
		tP = new javax.swing.Timer(150, this);
		tP1 = new javax.swing.Timer(150, this);
		tT= new javax.swing.Timer(150, this);
		tT1= new javax.swing.Timer(150, this);
		tP.addActionListener(this);
		tP1.addActionListener(this);
		tT.addActionListener(this);
		tT1.addActionListener(this);
		w = 125;
		h = 255;
		w1 = 350;
		h1 = 140;
		
	
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// campo battaglia
		ImageIcon background = new ImageIcon("b(1).png");
		background.paintIcon(this, g, 0, 0);

		// pikachu

		pikachu = new ImageIcon("pikachu.png");
		pikachu.paintIcon(this, g, w, h);

		// squirtle
		 squirtle = new ImageIcon("squirtle.png");
		squirtle.paintIcon(this, g, w1, h1);
		
		//tuono
		tuonoIcon=new ImageIcon("tuono.png");
		tuono=new JLabel(tuonoIcon);
		tuono.setVisible(false);
	
		tuono.setBounds(320, 0, 180, 100);
		this.add(tuono);
		
		
	
		
			
			

	}

	public void azionePikachu() {
		tP.start();
	}
	
	public void tuono() {
		tuono.setVisible(true);
		
	}



	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	public int getW1() {
		return w1;
	}

	public void setW1(int w1) {
		this.w = w1;
	}

	public int getH1() {
		return h1;
	}

	public void setH1(int h1) {
		this.h = h1;
	}
	
	
	
	

	




		
		
		
	
	
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();

////////////////////////Timer Pikachu////////////////////////////////////////////////////////////////////////

		// manda avanti
		if (o == tP) {
			
			
			if (h > 205) {
				tP1.stop();
				setW(w+170);
				setH(h - 150);
				repaint();
				tP1.restart();
			}
		}

		// torna indietro
		if (o == tP1) {
			if (h < 215) {
				setW(w-170);
				setH(h + 150);
				repaint();
				tP.stop();
			}
		}


		
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
	
	}
	
	

	

	}

