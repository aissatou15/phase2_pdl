import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;

public class RechercheBadge extends JFrame {
	  public RechercheBadge(){  
	
		
		//Définit un titre pour la fenêtre
		this.setTitle("Recherche Badge");
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
		

				pan.setLayout(null);
				JLabel userLabel = new JLabel("Search a card :");
				userLabel.setBounds(10, 10, 180, 25);
				pan.add(userLabel);

				JTextField userText = new JTextField(20);
				userText.setBounds(100, 10, 80, 25);
				pan.add(userText);
				
				
				JButton searchButton = new JButton("Search");
				searchButton.setBounds(180, 80, 80, 25);
				pan.add(searchButton);
	
				ActionListener searchButtonListener = new SearchButtonListener();
				searchButton.addActionListener(searchButtonListener);

				// rendre la fenêtre visible
				this.setVisible(true);
	  }
}