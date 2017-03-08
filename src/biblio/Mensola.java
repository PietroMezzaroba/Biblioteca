package biblio;


import biblio.Libro;

public class Mensola {
   
   Libro[] mensola = new Libro[1000];

	public void aggiungi(Libro libro) {
		for (int i = 0; i < mensola.length; i++) {
			if (mensola[i] == null) {
				mensola[i] = libro;
				break;
			}
		}

	}

public void ricerca(String Titolo) {
	for (int i = 0; i < mensola.length; i++) {
		if (mensola[i].getTitolo() == Titolo) {
			mensola[i].toString();
		
}
}
}
public void ricercaautore(String Autore) {
	for (int i = 0; i < mensola.length; i++) {
		if (mensola[i].getAutore() == Autore) {
			mensola[i].toString();
		
}
}
}
public void libritotali(int n) {
	for (int i = 0; i < mensola.length; i++) {
		if (mensola[i] == null) {
			mensola[i].toString();
		
}
}
}


}