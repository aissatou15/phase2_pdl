package gestionESIGELEC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe d'acces aux donnees contenues dans la table article
 * 
 * @author samba-lu
 * @version 1.2
 * */
public class BadgeDAO {

	/**
	 * Parametres de connexion Ã  la base de donnÃ©es oracle URL, LOGIN et PASS
	 * sont des constantes
	 */
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String LOGIN = "****";  //exemple BDD1
	final static String PASS = "****";   //exemple BDD1

	
	/**
	 * Constructeur de la classe
	 * 
	 */
	public BadgeDAO() {
		// chargement du pilote de bases de donnÃ©es
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {			System.err
					.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier .jar dans le projet");
		}

	}

	/**
	 * Permet d'ajouter un badge dans la table badge Le mode est auto-commit
	 * par dÃ©faut : chaque insertion est validÃ©e
	 * 
	 * @param badge
	 *            le badge Ã  ajouter
	 * @return retourne le nombre de lignes ajoutÃ©es dans la table
	 */
	public int block(Badge badge) {
		Connection con = null;
		PreparedStatement ps = null;
		int retour = 0;

		// connexion Ã  la base de donnÃ©es
		try {

			// tentative de connexion
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			// prÃ©paration de l'instruction SQL, chaque ? reprÃ©sente une valeur
			// Ã  communiquer dans l'insertion
			// les getters permettent de rÃ©cupÃ©rer les valeurs des attributs
			// souhaitÃ©s
			ps = con.prepareStatement("INSERT INTO badge (BA_BLOCK) VALUES (?)");
			ps.setInt(1, badge.getIne());
			
			// ExÃ©cution de la requÃªte
			retour = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fermeture du preparedStatement et de la connexion
			try {
				if (ps != null)
					ps.close();
			} catch (Exception ignore) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception ignore) {
			}
		}
		return retour;

	}

	/**
	 * Permet de rÃ©cupÃ©rer un badge Ã  partir de son numéro
	 * 
	 * @param num
	 *            le  num de l'article Ã  rÃ©cupÃ©rer
	 * @return 	le badge est trouvé
	 * 			null si aucun badge ne correspond à ce numéro
	 */
	public Badge getBadge(int ine) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Badge retour = null;

		// connexion Ã  la base de donnÃ©es
		try {

			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM badge WHERE BA_NUM = ?");
			ps.setInt(1, INE);

			// on exÃ©cute la requÃªte
			// rs contient un pointeur situÃ© juste avant la premiÃ¨re ligne
			// retournÃ©e
			rs = ps.executeQuery();
			// passe Ã  la premiÃ¨re (et unique) ligne retournÃ©e
			if (rs.next())
				retour = new Badge(rs.getInt("BA_NUM"));

		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			// fermeture du ResultSet, du PreparedStatement et de la Connexion
			try {
				if (rs != null)
					rs.close();
			} catch (Exception ignore) {
			}
			try {
				if (ps != null)
					ps.close();
			} catch (Exception ignore) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception ignore) {
			}
		}
		return retour;

	}

	/**
	 * Permet de rÃ©cupÃ©rer tous les badges stockÃ©s dans la table badge
	 * 
	 * @return une ArrayList de badges
	 */
	public List<Badge> getListBadges() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Badge> retour = new ArrayList<Badge>();

		// connexion Ã  la base de donnÃ©es
		try {

			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM badge");

			// on exÃ©cute la requÃªte
			rs = ps.executeQuery();
			// on parcourt les lignes du rÃ©sultat
			while (rs.next())
				retour.add(new Badge(rs.getInt("BA_NUM"));

		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			// fermeture du rs, du preparedStatement et de la connexion
			try {
				if (rs != null)
					rs.close();
			} catch (Exception ignore) {
			}
			try {
				if (ps != null)
					ps.close();
			} catch (Exception ignore) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception ignore) {
			}
		}
		return retour;

	}

	// main permettant de tester la classe
	public static void main(String[] args) throws SQLException {

		BadgeDAO BadgeDAO = new BadgeDAO();
		// test de la mÃ©thode ajouter
		Badge a1 = new Badge(10);
		int retour = BadgeDAO.ajouter(a1);

		System.out.println(retour + " lignes ajoutÃ©es");

		// test de la mÃ©thode getArticle
		Badge a2 = badgeAO.getBadge(1);
		System.out.println(a2);

		// test de la mÃ©thode getListeArticles
		List<Badge> liste = badgeDAO.getListeBadges();
		// affichage des articles
		for (Badge art : liste) {
			System.out.println(art.toString());
		}

	}
}
