import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//L'agence “oogle-stade” (Administrateur) crée un forum “OGCN”.
			
		Administrateur admin1 = new Administrateur("oogle-stade", 2113);
		ForumManager fm = new ForumManager();	
		fm.creerForum(admin1, "OGCN");
		Forum ogcn = fm.getListeForums(0);
		Membre mario = new Membre("Mario");
		Membre walter = new Membre("walter");
		mario.hp.put(ogcn,new ArrayList<Message>());	
		walter.hp.put(ogcn, new ArrayList<Message>());
		fm.inscription(ogcn, walter);
		fm.inscription(ogcn,mario);
		ogcn.creerCanal(mario, "#prochainMatch");
		Canal pm = ogcn.listeCanaux.get(0);
		Message wait = new Message("quand le prochain match sur Nice",mario);
		ogcn.ajouterMessageC(wait,pm);
		walter.hp.put(ogcn, walter.getNewMessage(ogcn));
		//System.out.println(walter.hp.get(ogcn).get(0).contenu);
		//System.out.println(walter.getNewMessage(ogcn));
		ogcn.creerCanalBreve(walter, "#suiviMatch-12-9-20", 50);
		CanaldeBreve cb = (CanaldeBreve) ogcn.getCanal().get(1);
		ogcn.ajouterMessageCB(new Message("Issa Nissa la Bella", walter),cb);
		
		///////////////////////////////////////////////////////////////////////
		
		Administrateur admin2 = new Administrateur("Jean-Pierre",1213);
		fm.creerForum(admin2, "NiceForum");
		Membre alban = new Membre("Alban");
		fm.inscription(ogcn, alban);
		Forum infoNice = fm.getListeForums(1);
		alban.hp.put(ogcn, new ArrayList<Message>());
		alban.hp.put(infoNice, new ArrayList<Message>());
		fm.inscription(infoNice, alban);
		infoNice.creerCanal(alban,"#soirees");
		alban.getNewMessage(ogcn);
		
		

	}
}
