
public class Main2 {
	
	public static int fibonacci(int number) {
		if(number ==1)
		{
			return 1;
		}
		else if(number == 2)
		{
			return 1;
		}
		else
			return fibonacci(number -1) + fibonacci(number - 2);
	}
	public static void main(String[] args) {
		System.out.println("�Ǻ���ġ ������ -1��° ���Ҵ�" + fibonacci(-1) + "�Դϴ�.");

	}

}