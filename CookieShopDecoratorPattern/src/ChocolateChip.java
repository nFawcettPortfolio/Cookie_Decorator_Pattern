
public class ChocolateChip extends Decorator{

	public ChocolateChip(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Adding Choclate Chips");
	}
	public String getDescription() {
		return temp.getDescription() + ", Chocolate Chip";
	}
	public double getCost() {
		return temp.getCost() + .25;
	}
}
