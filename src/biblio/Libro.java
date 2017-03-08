package biblio;

public class Libro {
   private String autore;
   private String titolo;
   private int anno;
   private String editore;
public String getAutore() {
	return autore;
}
public void setAutore(String autore) {
	this.autore = autore;
}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) {
	this.titolo = titolo;
}
public int getAnno() {
	return anno;
}
public void setAnno(int anno) {
	this.anno = anno;
}
public String getEditore() {
	return editore;
}
public void setEditore(String editore) {
	this.editore = editore;
}
public Libro(String autore, String titolo, int anno, String editore) {
	super();
	this.autore = autore;
	this.titolo = titolo;
	this.anno = anno;
	this.editore = editore;
}
@Override
public String toString() {
	return "Libro [autore=" + autore + ", titolo=" + titolo + ", anno=" + anno + ", editore=" + editore + "]";
}

   
   
}
