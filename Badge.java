

/**
*Classe Badge
*@author samba-lu
*@version 1.2
*/

   public class Badge {
                         /** 
                          * attribut : numero badge
                          */

	   					  private int ine;
	   private String block;

                          /**
                           * getter pour l'attribut numero badge
                           * @return valeur du numéro du badge
                           */
	public Badge(String block, int ine){
		this.block=block;
		this.ine=ine;
	}
		
                            public int getIne() {
                             return ine;
                             }

                            /**
                             * setter pour l'attribut numero badge
                             * @param emplacement :  nouvelle valeur du numéro du badge
                             */

                              public void setIne (int ine) {
                               this.ine= ine;

                              }
                       }
