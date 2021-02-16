import java.util.ArrayList;

public class Zoo {
	
	private static ArrayList<Jail> carnivorousAnimal;
	private static ArrayList<Jail> herbivorousAnimal;
	private static Vet cephas;
	
	public static void main(String[] args) {
		populateZoo();
		feedAnimals();
		herbivorousAnimal.get(0).getAnimal().print();
	}

	public static void populateZoo() {
   
	    // Criando os seis animais
	    Elephant dumbo = new Elephant("Dumbo", 2800, "vegetables", 2);
	    Elephant manny = new Elephant("Manny", 1900, "vegetables", 1);
	    Giraffe melman = new Giraffe("Melman", 3100, "vegetables", 10);
	    Giraffe bridget = new Giraffe("Bridget", 2700, "vegetables", 15);
	    Tiger shereKhan = new Tiger("Shere Khan", 300, "beef");
	    Tiger richardParker = new Tiger("Richard Parker", 360, "beef");
	    
	    // Criando e adcionando na lista os animais carnívoros
	    carnivorousAnimal = new ArrayList<Jail>();
	    carnivorousAnimal.add(new Jail(shereKhan));
	    carnivorousAnimal.add(new Jail(richardParker));
	    
	    // Criando e adcionando na lista os animais herbívoros
	    herbivorousAnimal = new ArrayList<Jail>();
	    herbivorousAnimal.add(new Jail(dumbo));
	    herbivorousAnimal.add(new Jail(manny));
	    herbivorousAnimal.add(new Jail(melman));
	    herbivorousAnimal.add(new Jail(bridget));
	    
	    cephas = new Vet("Cephas");
	    
	    // print atributos animais
	    System.out.println("########## List of animals ##########\n");
	    
	    for(Jail j:carnivorousAnimal) {
			j.getAnimal().print();
		}
		
		for(Jail j:herbivorousAnimal) {
			j.getAnimal().print();
		}
	    
	    System.out.println("#####################################");
    
	}
	
	public static void feedAnimals() {
		
		for(Jail j:carnivorousAnimal) {
			feedAnimal(cephas, j.getAnimal());
		}
		
		for(Jail j:herbivorousAnimal) {
			feedAnimal(cephas, j.getAnimal());
		}
	}

	public static void feedAnimal(Vet vet, Animal animal) {
		System.out.println("Vet " + vet.getName() + " is feeding the animal " + animal.getName());
		animal.eat();
	}

}