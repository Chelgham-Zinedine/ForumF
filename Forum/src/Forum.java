import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Forum {
	
	String name;
	Administrateur admin;
	ArrayList<Membre> listeMembres = new ArrayList<Membre>();
	ArrayList<Canal> listeCanaux = new ArrayList<Canal>();
	
	
	Forum(String s){
		name = s;
	}
	
	public void ajouterMembre(Membre m) {
		if(!listeMembres.contains(m))
			listeMembres.add(m);
	}
	
	public ArrayList<Membre> getListeMembres(){
		return listeMembres;
	}
	

	public Boolean contientCanalName(String s) {
		for(Canal c : listeCanaux) {
			if(c.name.equals(s))
				return true;		
		}
		return false;
	
	}
	
	public void creerCanal(Membre m,String s) {
		if(!contientCanalName(s))
			listeCanaux.add(new Canal(m,s));
		else
			System.out.println("Nom de canal existant !");
		
	}
	
	public void creerCanalBreve(Membre m,String s, int max) {
		if(!contientCanalName(s))
			listeCanaux.add(new CanaldeBreve(m,s, max));
		else
			System.out.println("Nom de canal existant !");
		
	}
	
	public void ajouterMessageC(Message m, Canal c) { 
		c.ajouterMessage(m);
	    ArrayList<Message> msg = new ArrayList<Message>();
	    m.membre.hp.get(this).add(m);
	}
	
	public void ajouterMessageCB(Message m, CanaldeBreve cb) { 
		if(m.contenu.length()<=cb.tailleMaxMessage) {
			cb.ajouterMessage(m);
			ArrayList<Message> msg = new ArrayList<Message>();
			m.membre.hp.get(this).add(m);
		}
		else
			System.out.println("Votre message est trop long... la taille max est de " + cb.tailleMaxMessage);
	}
	 
		
	
	
	public ArrayList<Canal> getCanal() {
		return listeCanaux;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	String sujet;
	ArrayList<Message> listeMessages = new ArrayList<>(); 
	ArrayList<Membre> listeMembre = new ArrayList<>(); 
	String date;
	
	
	public Forum(String s) {
		sujet=s;
		LocalDateTime lcdt = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		date = lcdt.format(myFormatObj);
	}
	
	public void ajouterMembre(Membre m) {
		if(!listeMembre.contains(m))
			listeMembre.add(m);
		
	}
	
	public void ajouterMessage(Message msg) {
			listeMessages.add(msg);
		
	}
	
	public ArrayList<Membre> getListeMembres(){
		return this.listeMembre;
	}

	public ArrayList<Message> getlisteMessage() {
		// TODO Auto-generated method stub
		return this.listeMessages;
	}
	*/
	
}
