
public abstract class Decorator implements Cookie{
	protected Cookie temp;
	public Decorator(Cookie newCookie) {
		temp =newCookie;
	}
	public String getDescription() {
		return temp.getDescription();
	}
	public double getCost() {
		return temp.getCost();
	}
}
