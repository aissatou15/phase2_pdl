import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
	  public Fenetre(){  
	
		
		//Définit un titre pour la fenêtre
		this.setTitle("connexion");
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
				JLabel userLabel = new JLabel("User");
				userLabel.setBounds(10, 10, 80, 25);
				pan.add(userLabel);

				JTextField userText = new JTextField(20);
				userText.setBounds(100, 10, 160, 25);
				pan.add(userText);
				
				JLabel passwordLabel = new JLabel("Password");
				passwordLabel.setBounds(10, 40, 80, 25);
				pan.add(passwordLabel);

				JPasswordField passwordText = new JPasswordField(20);
				passwordText.setBounds(100, 40, 160, 25);
				pan.add(passwordText);
				
				
				JButton loginButton = new JButton("login");
				loginButton.setBounds(180, 80, 80, 25);
				pan.add(loginButton);
	
				ActionListener loginButtonListener = new LoginButtonListener();
				loginButton.addActionListener(loginButtonListener);

				// rendre la fenêtre visible
				this.setVisible(true);
	  }
	  }

	 