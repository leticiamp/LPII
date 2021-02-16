
public class Tiger extends Animal {

	public Tiger(String name, int weight, String foodType) {
		super(name, weight, foodType);
	}
	
	@Override
	protected void setFoodAmount() {
		this.foodAmount = 0.03 * this.weight;
	}

	@Override
	public void eat() {
		if(!fed) {
			this.fed = true;
		}
		System.out.println("The Tiger " + this.name + " ate " + this.foodAmount + " kilos");
	}
	
	@Override
	public void print() {
        
        System.out.println("Tiger");
        System.out.println("Name: " + getName());
        System.out.println("Age(years): " + calcAge());
        System.out.println("Weight: " + getWeight());
        System.out.println("Fed: " + isFed());
        System.out.println("Food amount: " + getFoodAmount());
        System.out.println("Food type: " + getFoodType());
        System.out.println();
    }
}
