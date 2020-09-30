import java.util.ArrayList;

public class Canal {
	
	Membre owner;
	int nbMaxMessage=1000;
	String name;
	Forum forum;
	ArrayList<Message> listeMsg = new ArrayList<Message>();
	
	Canal(Membre m,String s){
		owner=m;
		name=s;
	}
	
	public void ajouterMessage(Message m) {
		listeMsg.add(m);
	}
	
	public ArrayList<Message> getMessages(){
		return listeMsg;
	}
	
	public void listerMessage() {
		//TODO
		
	}
}
