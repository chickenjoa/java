
public class Main2 {
	
	public static int factor(int number) {
		if(number ==1)
		{
			return 1;
		}
		else
			return number * factor(number -1);
		// 5! = 5 * 4!
	}

	public static void main(String[] args) {
		System.out.println("5���丮����" + factor(5));

	}

}
