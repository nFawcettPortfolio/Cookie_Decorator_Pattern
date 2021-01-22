
public class Pecan extends Decorator{

	public Pecan(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Adding Pecan");
	}
	public String getDescription() {
		return temp.getDescription() + ", Pecans";
	}
	public double getCost() {
		return temp.getCost() + .25;
	}
}
