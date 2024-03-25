package chapter7.array;

public class CharArray {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A'; // 코드값 65로 저장.
		
		for(int i=0; i<alphabets.length; i++, ch++) {  // 1)alphabets.length 은 26으로 해석된다.  3)i와 ch가 1씩 증가한다.
			alphabets[i] = ch; // ch 변수에 +1 반영이 되어있다.  //2)ch 내용이 i에 저장된다.
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int) alphabets[i]);
		}
		
	}

}
