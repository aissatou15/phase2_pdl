import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class ConfirmationYes extends JFrame {
	  public ConfirmationYes(){  
	
		//Définit un titre pour la fenêtre
		this.setTitle("ConfirmationYes");
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
			
			JLabel userLabel = new JLabel("Your card is blocked !");
			userLabel.setBounds(10, 10, 300, 60);
			pan.add(userLabel);
			
			
			JButton okButton = new JButton("ok");
			okButton.setBounds(50, 100, 80, 25);
			pan.add(okButton);
			
			ActionListener OkButtonListener = new CardsButtonListener();
			okButton.addActionListener(OkButtonListener);
		  
			// rendre la fenêtre visible
			this.setVisible(true);
	  }
}