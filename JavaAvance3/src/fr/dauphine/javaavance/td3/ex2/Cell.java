package fr.dauphine.javaavance.td3.ex2;

public class Cell<T> {
	
	T contenu;
	Cell<T> refsuivante;
	
	
	public Cell(T contenu, Cell<T> refsuivante){
		this.contenu = contenu;
		this.refsuivante = refsuivante;
	}
	
	
	public Cell(T contenu){
		this.contenu = contenu;
		this.refsuivante = null;
	}
	
	
	public Cell() {
		contenu = null;
		refsuivante = null;
	}
	
	
	public Object getContenu() {
		return contenu;
	}
	
	
	public Cell<T> getSuivant() {
		return refsuivante;
	}
}
