
public class Main {

	public static void main(String[] args) {

		Hero[] heros = new Hero[3];			//다형성 자식클래스 초기화
		heros[0] = new Worrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Magic("마법사");

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
