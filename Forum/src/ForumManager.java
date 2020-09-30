import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ForumManager {
	
	ArrayList<Forum> listeForums = new ArrayList<Forum>();
	Scanner sc = new Scanner(System.in);
	HashMap <String, Integer>verifAdmin = new HashMap();
	
	ForumManager(){
		verifAdmin.put("oogle-stade",2113);
		verifAdmin.put("Jean-Pierre",1213);
	}
	
	public Forum getListeForums(int i){
		return listeForums.get(i);
	}
	
	public void posterMessage(Forum f, Canal c, Message m) {
		if(f.listeCanaux.contains(c)) {
			c.listeMsg.add(m);
		}
		else
			System.out.println("Erreur de canal ou de Forum");
		
	}
	
	public void creerForum(Administrateur admin, String s) {
		if(verifAdmin.containsValue(admin.idAdmin))
			listeForums.add(new Forum(s));
		else
			System.out.println("Echec création Forum");
		
	}
	
	public void inscription(Forum f) {
		Membre m = new Membre(sc.next());
		f.listeMembres.add(m);
		
	}
	
	public void inscription(Forum f, Membre m) {
		f.listeMembres.add(m);
	   // m.hp.put(f, f.getCanal().);
	  // m.hp.put(f, m.getNewMessage(f));
			
		
	}
	
	
	
	
	
	
	
}
