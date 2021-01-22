import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		final DecimalFormat df = new DecimalFormat("#.##");
		Cookie cookie = new ChocolateChip(new Sprinkles(new Pecan(new PlainCookie())));
		System.out.println("Descriptsion: " + cookie.getDescription());
		System.out.println("Cost: $" + df.format(cookie.getCost()));
		
		Cookie cookie2 = new ChocolateChip(new PeanutButter(new PlainCookie()));
		System.out.println("Descriptsion: " + cookie2.getDescription());
		System.out.println("Cost: $" + df.format(cookie2.getCost()));
	}
}
