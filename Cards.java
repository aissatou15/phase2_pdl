import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Cards extends JFrame {
	  public Cards(){  
	
		//D�finit un titre pour la fen�tre
		this.setTitle("Manage cards");
		//d�finit la taille : 400 pixels de large et 100 pixels de haut
		this.setSize(300,150);
		//positionnement de l�objet au centre 
		this.setLocationRelativeTo(null) ;
		//termine le processus si on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Instanciation d'un objet JPanel
		    JPanel pan = new JPanel();
		    //D�finition de sa couleur de fond
		    pan.setBackground(Color.WHITE);
		   
		    //On pr�vient � notre  JFrame que notre JPanel sera son content panel
		    this.setContentPane(pan); 
		    JPanel panel = new JPanel();
			this.getContentPane().add(panel);
			
			JButton createButton = new JButton("Create a card");
			createButton.setBounds(10, 10, 80, 25);
			pan.add(createButton);
			
			JButton deleteButton = new JButton("Delete a card");
			deleteButton.setBounds(10, 40, 80, 25);
			pan.add(deleteButton);
			
			JButton blockButton = new JButton("Block a card");
			blockButton.setBounds(10, 70, 80, 25);
			pan.add(blockButton);
			
			JButton unblockButton = new JButton("Unblock a card");
			unblockButton.setBounds(10, 100, 80, 25);
			pan.add(unblockButton);
			
			ActionListener loginButtonListener2 = new BlocButtonListener();
			blockButton.addActionListener(loginButtonListener2);
			
			// rendre la fen�tre visible
			this.setVisible(true);
	  }
}