import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Confirmation extends JFrame {
	  public Confirmation(){  
	
		//Définit un titre pour la fenêtre
		this.setTitle("Confirmation");
		//définit la taille : 400 pixels de large et 100 pixels de haut
		this.setSize(500, 300) ;
		//positionnement de l’objet au centre 
		this.setLocationRelativeTo(null) ;
		//termine le processus si on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Instanciation d'un objet JPanel
		    JPanel pan = new JPanel();
		    //Définition de sa couleur de fond
		    pan.setBackground(Color.WHITE);
		   
		    //On prévient à notre  JFrame que notre JPanel sera son content panel
		    this.setContentPane(pan); 
		    JPanel panel = new JPanel();
			this.getContentPane().add(panel);
			pan.setLayout(null);
			
			JLabel userLabel = new JLabel("Are you sure you want to block this badge?");
			userLabel.setBounds(10, 10, 300, 60);
			pan.add(userLabel);
			
			JButton yesButton = new JButton("yes");
			yesButton.setBounds(50, 50, 80, 25);
			pan.add(yesButton);
			
			JButton noButton = new JButton("no");
			noButton.setBounds(50, 100, 80, 25);
			pan.add(noButton);
			
			ActionListener CardsButtonListener = new YesButtonListener();
			yesButton.addActionListener(CardsButtonListener);
			
		  ActionListener CardsButtonListener2 = new CardsButtonListener();
			noButton.addActionListener(CardsButtonListener2);
		  
			// rendre la fenêtre visible
			this.setVisible(true);
	  }
}
