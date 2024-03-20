package chapter4.ifexample;

//선택문 : 다중if문과 유사.
public class SwitchCase {

	public static void main(String[] args) {
		
		int ranking = 1;  // 1,2,3 기타 이외의 값
		char medalColor;
		
		switch(ranking) {
		case 1: medalColor = 'G';
				break;
		case 2: medalColor = 'S';
			break;
		case 3: medalColor = 'B';
			break;
			
		default:  //if문의 else와 같은 역할. 꼭 써야하는건 아님. 선택적으로 사용.
			medalColor = 'A';
			
		}
		
		System.out.println(ranking + "등 메달의 색깔은? " + medalColor + "입니다.");
		
	}

}
