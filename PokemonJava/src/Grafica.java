import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Grafica extends JFrame implements ActionListener {
	private Battle b;
	private JTextArea area;
	private JPanel sud, nord;
	private JButton mossa1;
	private JButton mossa2;
	private JButton mossa3;
	private PannelloBattaglia bp;
	private JProgressBar bar, enemyBar;
	private JMenuBar menu;
	private JMenuItem info, about;
	

	public Grafica() {
		super("PokemonJava");
		Container c = getContentPane();
		Pokemon p = new Pokemon("Pikachu", "Pikachu.png", "tuono", "azione", "elettro", "normale", "elettro");
		Pokemon p2 = new Pokemon("Squirtle", "Squirtle.png", "pistolacqua", "azione", "acqua", "normale", "acqua");
		b = new Battle(p, p2);

		bp = new PannelloBattaglia();
		bp.setLayout(null);
		
		

		// menu
		menu = new JMenuBar();
		info = new JMenuItem("info");
		info.addActionListener(this);
		about = new JMenuItem("about");
		about.addActionListener(this);
		this.setJMenuBar(menu);
		menu.setSize(20, 5);
		menu.add(info);
		menu.add(about);
		
		// grafica

		JPanel centro = new JPanel(new BorderLayout());
		centro.add(bp);

		

		// area di testo e bottoni

		JPanel sud1 = new JPanel();
		JPanel sud2 = new JPanel();
		sud = new JPanel(new BorderLayout());

		JScrollPane js = new JScrollPane();
		area = new JTextArea(2, 7);
		js.add(area);
		area.setText("è il momento di combatere");
		sud2.add(area);

		mossa1 = new JButton(p.getMossa1());
		mossa1.setBackground(Color.yellow);
		mossa1.addActionListener(this);
		mossa2 = new JButton(p.getMossa2());
		mossa2.setBackground(Color.CYAN);
		mossa2.addActionListener(this);
		sud1.add(mossa1);
		sud1.add(mossa2);

		// create a progressbar
		bar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
		bar.setLayout(null);
		// set initial value
		bar.setValue(100);

	
		bar.setBackground(Color.green);
		bar.setForeground(Color.green);
		bar.setBounds(100, 240, 150, 15);


		// add progressbar
		bp.add(bar);

		// create a Enemy progressbar
		enemyBar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
		enemyBar.setLayout(null);
		// set initial value
		enemyBar.setValue(100);

		enemyBar.setBackground(Color.green);
		enemyBar.setForeground(Color.green);
		enemyBar.setBounds(305, 120, 150, 15);

		// add progressbar
		bp.add(enemyBar);
		

		// sfondo
		Color color = new Color(134, 115, 161);
		sud1.setBackground(color);
		sud2.setBackground(color);
		sud.add(sud1, "North");
		sud.add(sud2, "South");

		
		
		
		
		c.add(centro);
		c.add(sud, "South");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(520, 460);
		setResizable(false);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grafica g = new Grafica();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object o = arg0.getSource();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
		// mossa2
		if (o == mossa2) {
			String mossa = "";
			mossa = mossa2.getText();
			

			// difesa
			if (b.difesa("azione") == false) {

				area.setText(":Squirtle nemico usa azione. ");
				
				
				
			if(b.getHp()>40)
			{
				bar.setBackground(Color.white);
				bar.setValue(b.getHp());
				bar.setForeground(Color.green);
			}
			else
			{
				bar.setBackground(Color.white);
				bar.setValue(b.getHp());
				bar.setForeground(Color.red);
			}
				

			

				

			

			}

			else {
				bar.setForeground(Color.white);
				JOptionPane.showMessageDialog(this, "Sei stato sconfitto andra' meglio la prossima volta");
				System.exit(0);
			}

			if (b.attacco(mossa) == false) {
				area.append("è il tuo turno: cosa deve fare Pikachu?"+"\n");
				

				// azione pikachu
				bp.azionePikachu();

				if(b.getHpEnemy()>40) {
					enemyBar.setBackground(Color.white);
					enemyBar.setValue(b.getHpEnemy());
					enemyBar.setForeground(Color.green);

				}
				else
				{
					enemyBar.setBackground(Color.white);
					enemyBar.setValue(b.getHpEnemy());
					enemyBar.setForeground(Color.red);
				}
			
				area.append("PiKachu usa " + mossa);
		

			} else {
				enemyBar.setForeground(Color.white);
				JOptionPane.showMessageDialog(this, "Complimenti hai vinto la tua prima battaglia");
				System.exit(0);
			}

		}

		// attacco

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		// mossa1
		if (o == mossa1) {
			String mossa = "";
			mossa = mossa1.getText();

			if (b.difesa("azione") == false) {
				area.setText("è il turno di Squrtile nemico" + "\n" + "Squirtle nemico usa azione");
				if(b.getHp()>40)
				{
					bar.setBackground(Color.white);
					bar.setValue(b.getHp());
					bar.setForeground(Color.green);
				}
				else
				{
					bar.setBackground(Color.white);
					bar.setValue(b.getHp());
					bar.setForeground(Color.red);
				}
			} else {
				bar.setForeground(Color.white);
				JOptionPane.showMessageDialog(this, "Sei stato sconfitto andra' meglio la prossima volta");
				System.exit(0);
			}

			if (b.attacco(mossa) == false) {
				
			
				bp.tuono();

				if(b.getHpEnemy()>40) {
					enemyBar.setBackground(Color.white);
					enemyBar.setValue(b.getHpEnemy());
					enemyBar.setForeground(Color.green);

				}
				else
				{
					enemyBar.setBackground(Color.white);
					enemyBar.setValue(b.getHpEnemy());
					enemyBar.setForeground(Color.red);
				}
				area.setText("Pikachu usa tuono" + "\n" + "Wow è superefficace");
			

			} else {
				enemyBar.setForeground(Color.white);
				JOptionPane.showMessageDialog(this, "Complimenti hai vinto la tua prima battaglia");
				System.exit(0);
			}

		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				

		if (o == info)
			JOptionPane.showMessageDialog(this,
					"Questo programma simula una battaglia pokemon." + "\n" + " Il gioco è a turni e potrai"
							+ " usare le mosse tramite i bottoni sottostanti" + "\n"
							+ "ps. ricorda che l'acqua conduce molto bene");

		if (o == about)
			JOptionPane.showMessageDialog(this, "Credit:Antonio Greco");

	}

}
