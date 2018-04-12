import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

	
public class Menu extends JFrame {
	  public Menu(){  
	
		//Définit un titre pour la fenêtre
		this.setTitle("Menu");
		//définit la taille : 400 pixels de large et 100 pixels de haut
		this.setSize(300, 150) ;
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
			
			JButton peopleButton = new JButton("Manage people");
			peopleButton.setBounds(10, 10, 80, 25);
			pan.add(peopleButton);
			
			JButton placeButton = new JButton("Manage place");
			placeButton.setBounds(10, 10, 80, 25);
			pan.add(placeButton);
			
			JButton cardsButton = new JButton("Manage cards");
			cardsButton.setBounds(10, 10, 80, 25);
			pan.add(cardsButton);
			
			ActionListener CardsButtonListener = new CardsButtonListener();
			cardsButton.addActionListener(CardsButtonListener);
		
			// rendre la fenêtre visible
			this.setVisible(true);
	  }
}