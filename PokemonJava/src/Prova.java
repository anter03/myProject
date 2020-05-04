import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prova extends JFrame implements ActionListener {

	private TextArea t;
	private  javax.swing.Timer time;
	private JButton b;
	
	
	public Prova()
	{
		Container c=getContentPane();
				t=new TextArea();
				
				time=new javax.swing.Timer(2000,this);
				b=new JButton("www");
				b.addActionListener(this);
				
				JPanel centro=new JPanel();
				centro.add(t);
				JPanel sud=new JPanel();
				sud.add(b);
				c.add(centro);
				c.add(sud,"South");
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prova();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o=e.getSource();
		
		if(o==b)
		{
			t.setText("");
			t.setText("Primo");
			time.start();
			}
		else
			if (time.getDelay()==2000){
		time.stop();
			t.append("Secondo");
			}
		
	}

}
