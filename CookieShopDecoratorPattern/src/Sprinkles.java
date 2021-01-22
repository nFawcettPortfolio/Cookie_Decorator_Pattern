public class Sprinkles extends Decorator{

	public Sprinkles(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Adding Sprinkles");
	}
	public String getDescription() {
		return temp.getDescription() + ", Sprinkles";
	}
	public double getCost() {
		return temp.getCost() + .10;
	}
}
