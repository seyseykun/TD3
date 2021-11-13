package fr.dauphine.javaavance.td3.ex2;

public class MyList<T> {

	Cell<T> refpremiere;  //Une Cell est un contenu et une autre Cell. 
	
	
	public MyList(Cell<T> refpremiere) {
		this.refpremiere = refpremiere;
	}
	
	
	public MyList() {
		refpremiere = null;
	}
	
	
	public void add(T contenu) {  //Cette m�thode ajoute un Cell au d�but de la liste
		Cell<T> anciennerefpremiere = refpremiere;
		refpremiere = new Cell<T>(contenu, anciennerefpremiere);
	}
	
	
	public void addLast(T contenu) {
		if (refpremiere == null) {
			refpremiere = new Cell<T>(contenu);
		}
		else {
			Cell<T> derniere = new Cell<T>(contenu); //On cr�e la Cell � ajouter � la fin de la liste
			getDerniere().refsuivante = derniere;    //On change la valeur refsuivante de la derni�re Cell (ce qui fait qu'elle n'est plus la derni�re cellule)
		}
	}
	
	
	public int size() {
		int len = 0;
		Cell<T> ref = getPremiere();  //getPremier renvoie la r�f�rence de la premi�re Cell
		while (ref != null) {
			len++;
			ref = ref.getSuivant();  //getSuivant renvoie la r�f�rence de la cellule suivante
		}
		return len;
	}
	
	
	public String toString() {
		String result = "";
		Cell<T> ref = getPremiere();
		while(ref != null) {
			result += ref.getContenu();
			ref = ref.getSuivant();
			if (ref != null) {
				result += ", ";
			}
		}
		return result;
	}
	
	
	public Object get(int index) {
		Cell<T> ref = refpremiere;
		for (int i = 1; i < index; i++) {
			ref = ref.getSuivant();
		}
		return ref.getContenu();
	}
	
	
	
	public int sumLetter() {
        int sum = 0;
        Cell<T> c = refpremiere;

        while (c != null) {
            sum += c.getContenu().toString().length();
            c = c.getSuivant();
        }

        return sum;
    }
	
	
	public boolean contains(Object contenu) {
        Cell<T> ref = refpremiere;

        while (ref != null) {
            if (ref.getContenu().equals(contenu))
                return true;
            ref = ref.getSuivant();
        }

        return false;
    }
	
	
	public Cell<T> getPremiere() {
		return refpremiere;
	}
	
	
	public Cell<T> getDerniere() {
		Cell<T> ref = getPremiere();
		while (ref.getSuivant() != null) {
			ref = ref.getSuivant();
		}
		return ref;
	}
	
	
	
}
