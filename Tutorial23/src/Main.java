
public class Main {

	public static void main(String[] args) {

		Hero[] heros = new Hero[3];			//������ �ڽ�Ŭ���� �ʱ�ȭ
		heros[0] = new Worrior("����");
		heros[1] = new Archer("�ü�");
		heros[2] = new Magic("������");

		for(int i = 0; i <heros.length; i++) {
			heros[i].attack();
			
			if(heros[i] instanceof Worrior) {
				Worrior temp = (Worrior) heros[i];
				temp.groundCutting();
			}
			else if(heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			}
			else if(heros[i] instanceof Magic) {
				Magic temp = (Magic) heros[i];
				temp.Freezem();
			}
		}
	}

}
