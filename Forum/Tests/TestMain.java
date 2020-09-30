import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	void testMainScenario() {
		//L'agence “oogle-stade” (Administrateur) crée un forum “OGCN”.
		Forum ogcn = new Forum("OGCN");
		
		//Initialisation du Forum avec les membres
		Membre mario = new Membre("Mario");
		Membre walter = new Membre("Walter");
		Membre alban = new Membre("Alban");
		ogcn.ajouterMembre(mario);
		ogcn.ajouterMembre(walter);
		ogcn.ajouterMembre(alban);
		ArrayList<Membre> membres = ogcn.getListeMembres();
		assertEquals(3, membres.size());
		
		////////////////////////////////////////////////////////////
		
		Message wait = new Message("a quoi cela sert de courir?", mario);
		ogcn.ajouterMessage(wait);
		assertEquals(1, ogcn.getlisteMessage().size());
		
		////////////////////////////////////////////////////////////
		
		List<Message> messages = ogcn.getNewMessages(walter);
		assertTrue(messages.contains(wait));
	}

}
