import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Animal {

	protected String name;
	protected Date dateBirth;
	protected int weight; // peso
	protected boolean fed; // alimentado
	protected double foodAmount; // alimento
	protected String foodType; // alimentação

	public Animal(String name, int weight, String foodType) {

		this.name = name;
		this.dateBirth = convertStringToDate("01/01/1990");
		this.weight = weight;
		this.fed = false;
		this.setFoodAmount();
		this.foodType = foodType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isFed() {
		return fed;
	}

	public void setFed(boolean fed) {
		this.fed = fed;
	}

	public double getFoodAmount() {
		return foodAmount;
	}

	protected void setFoodAmount() {
		this.foodAmount = 0.05 * this.weight;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public void showFoodTypeInfo() {
		System.out.println(getName() + " ate " + this.foodAmount + " kilos");
	}

	public void eat() {
		if (!fed) {
			this.fed = true;
		}
		System.out.println("I just ate " + this.foodAmount + " kilos");
	}

	public void print() {

		System.out.println("Name: " + getName());
		System.out.println("Age(years): " + calcAge());
		System.out.println("Weight: " + getWeight());
		System.out.println("Fed: " + isFed());
		System.out.println("Food amount: " + getFoodAmount());
		System.out.println("Food type: " + getFoodType());
		System.out.println();
	}

	public Date convertStringToDate(String date) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = null;
		
		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return d;
	}

	// Calculando idade
	public int calcAge() {

		Calendar c = Calendar.getInstance();
		int currentYear = c.get(Calendar.YEAR);
		@SuppressWarnings("deprecation")
		int birth = this.dateBirth.getYear() + 1900;

		System.out.println("current year: " + currentYear + "birth: " + birth);
		return (currentYear - birth);
	}
}
