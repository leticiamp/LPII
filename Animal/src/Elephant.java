
public class Elephant extends Animal {
	
	private int trunkSize; //tamanho da tromba
	
	public Elephant(String name, int weight, String foodType, int trunkSize) {
		super(name, weight, foodType);
		this.trunkSize = trunkSize;
	}

	public int getTrunkSize() {
		return trunkSize;
	}

	public void setTrunkSize(int trunkSize) {
		this.trunkSize = trunkSize;
	}
	
	@Override
	public void eat() {
		if(!fed) {
			this.fed = true;
		}
		System.out.println("The elephant " + this.name + " ate " + this.foodAmount + " kilos");
	}

	@Override
	public void print() {
		
        System.out.println("Elephant");
        System.out.println("Name: " + getName());
        System.out.println("Age(years): " + calcAge());
        System.out.println("Weight: " + getWeight());
        System.out.println("Fed: " + isFed());
        System.out.println("Food amount: " + getFoodAmount());
        System.out.println("Food type: " + getFoodType());
        System.out.println("Trunk size: " + this.trunkSize);
        System.out.println();
    }
}
