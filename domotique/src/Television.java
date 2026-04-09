/**
 * classe qui represente une Television
 */
class Television implements Appareil {

	/**
	 * l'intensite du son de la Television, on suppose que la Television est eteinte si
	 * le son vaut 0
	 */
	private int son = 0;

	/**
	 * permet d'allumer ou d'augmenter le son de la Television
	 */
	public void allumer() {
		this.son += 10;
		// son maximum
		if (this.son > 100)
			this.son = 100;
	}

	/**
	 * permet d'eteindre la Television (son mis a 0)
	 */
	public void eteindre() {
		this.son = 0;

	}

	/**
	 * surcharge de la methode affichage sous la forme "Television:10"
	 * 
	 * @return descriptif sous forme de Television
	 */
	public String toString() {
		String r = "";
		r += "Television:" + son;
		return (r);
	}
}