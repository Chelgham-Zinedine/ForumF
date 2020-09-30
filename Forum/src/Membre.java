import java.util.ArrayList;
import java.util.HashMap;

public class Membre {

	private String name;
	HashMap<Forum,  ArrayList<Message>> hp = new HashMap<Forum, ArrayList<Message>>() ;
	

	public Membre(String name) {
		this.name= name;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Message> getNewMessage(Forum f) {
		ArrayList<Message> nvMsg = new ArrayList<Message>();
		if(hp.containsKey(f)) {
			for(int i=0; i<f.listeCanaux.size(); i++) {
				for(int j=0; j<f.listeCanaux.get(i).listeMsg.size(); j++) {
					if(!hp.get(f).contains(f.listeCanaux.get(i).listeMsg.get(j))) {
						nvMsg.add(f.listeCanaux.get(i).listeMsg.get(j));
					}
				}
			}
		}
		if(nvMsg.isEmpty())
			System.out.println("Il n'y a pas de nouveau message pour le moment...");	
		return nvMsg;
		
			
				
				
		
	}
	
	
}
