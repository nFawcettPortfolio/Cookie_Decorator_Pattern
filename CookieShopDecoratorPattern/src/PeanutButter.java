public class PeanutButter extends Decorator{

	public PeanutButter(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Adding Peanut Butter");
	}
	public String getDescription() {
		return temp.getDescription() + ", Peanut Butter";
	}
	public double getCost() {
		return temp.getCost() + .35;
	}
}
