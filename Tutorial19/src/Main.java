
public class Main extends Parent {
	
	public void show() {
		System.out.println("hello"); // 상속받은Parent에서 오버라이딩이 안되고 현재 적은 문에서 오버라이딩이 됨
	}

	public static void main(String[] args) {

		Main main = new Main();
		main.show();

	}

}
