
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouter(l1);
		
		/****** A COMPLETER ******/
		Hifi h1 = new Hifi();
		Cheminee c1 = new Cheminee();

		t.ajouter(h1);
		t.ajouter(new AdapterCheminee(c1));
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
