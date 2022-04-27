
public class Main implements Dog,Cat {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.one();
		main.two();
	}

	@Override
	public void crying() {
		
		System.out.println("Па! Па!");
		
	}

	@Override
	public void two() {
		System.out.println("Па! Па!");
		
	}

	@Override
	public void one() {
		System.out.println("Па! Па!");
		
	}

}
