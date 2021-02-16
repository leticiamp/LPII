
public class Giraffe extends Animal {
	
	private int tougueSize; //tamanho da lingua
	
	public Giraffe(String name, int weight, String foodType, int tougueSize) {
		super(name, weight, foodType);
		this.tougueSize = tougueSize;
	}

	@Override
	protected void setFoodAmount() {
		this.foodAmount = 0.1 * this.weight;
	}
	
	public int getTougueSize() {
		return tougueSize;
	}

	public void setTougueSize(int tougueSize) {
		this.tougueSize = tougueSize;
	}

	@Override
	public void eat() {
		if(!fed) {
			this.fed = true;
		}
		System.out.println("The giraffe " + this.name + " ate " + this.foodAmount + " kilos");
	}
	
	@Override
	public void print() {
        
        System.out.println("Giraffe");
        System.out.println("Name: " + getName());
        System.out.println("Age(years): " + calcAge());
        System.out.println("Weight: " + getWeight());
        System.out.println("Fed: " + isFed());
        System.out.println("Food amount: " + getFoodAmount());
        System.out.println("Food type: " + getFoodType());
        System.out.println("Tongue size: " + this.tougueSize);
        System.out.println();
    }
}
