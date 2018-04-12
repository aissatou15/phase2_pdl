/**
*Classe Lieu
*@author samba-lu
*@version 1.2
*/

public class Lieu {
		                /** 
			            * emplacement du lieu
			            */
		
		                private String emplacement;
		                 /** 
			             * horaire du lieu
			             */
		
		                private String horaire;
		                 /** 
			            * nombre d�acc�s du lieu
			           */
		
		                private int nbAcces;
		
		                /**
		                 * Constructeur
		                 * @param emplacement emplacement du lieu
		                 * @param horaire horaire du lieu
		                 * @param nbAcces nombre d�acc�s du lieu
		                 */
		
		                                
		                  public Lieu( String emplacement, String horaire, int nbAcces){
		                  this.emplacement=emplacement ;
		                  this.horaire=horaire ;
		                  this.nbAcces=nbAcces ;
		                   }
		
		                   /**
		                   * getter pour l'attribut emplacement
			               * @return valeur de l�emplacement du lieu
			               */
		
		                   public String getEmplacement() {
		                   return emplacement;
		                   }
		
		                   /**
			                * getter pour l'attribut horaire
			                * @return valeur de l�horaire du lieu	
			                */
		
		                    public String getHoraire() {
		                    return horaire;
		                     }
		                      /**
		                       * getter pour l'attribut nombre d�acc�s
		                       * @return valeur du nombre d�acc�s du lieu
		                       */
		
		                       public int getNbAcces() {
		                       return nbAcces;
		                                    }
		                       /**
		                        * setter  pour l'attribut emplacement
		                        * @param emplacement :  nouvelle valeur de l�emplacement du lieu
		                        */
		
		                         public void setEmplacement(String place) {
		                         emplacement= place;
		                         }
		                         /**
		                          * setter  pour l'attribut horaire
		                          * @param lhoraire :  nouvelle valeur de l�horaire du lieu
		                          */
		
		                           public void setHoraire(String lhoraire) {
		                           horaire= lhoraire;
		                           }
		                           /**
		                            * setter  pour l'attribut nb d�acc�s
		                            * @param leNbAcces :  nouvelle valeur du nb d�acc�s du lieu
		                            */
		
		                            public void setNbAcces(int leNbAcces) {
		                            nbAcces= leNbAcces;
		                            }
		          }
  

