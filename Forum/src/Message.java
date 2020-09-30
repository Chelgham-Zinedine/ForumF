import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Message {
	
	String contenu;
	Membre membre;
	public Message(String s, Membre m) {
		contenu=s;
		membre=m;
	}
	

}
