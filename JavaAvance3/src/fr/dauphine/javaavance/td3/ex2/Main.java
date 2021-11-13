package fr.dauphine.javaavance.td3.ex2;

public class Main {
	
	public static void main(String[] args) {
		
		
		Cell<String> c1 = new Cell<>("Cellule 1", null);
		
		MyList<Object> L1 = new MyList<>();
		
		L1.add(c1);;
		L1.add("Cellule 0");
		L1.addLast("Cellule 2");
		System.out.println(L1.toString());
		
		
		MyList<Object> ml = new MyList<>();
		
		ml.addLast("tatu");
		ml.add("toto");
		ml.add("titi");
		ml.addLast("tutu");
		ml.addLast(4);
		
		System.out.println(ml.toString());
		
		System.out.println(L1.sumLetter());
		System.out.println(ml.sumLetter());
		
		
	}
	
	
	
}
