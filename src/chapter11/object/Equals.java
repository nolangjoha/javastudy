package chapter11.object;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		//super(); 컴파일하면 자동 생성된다.
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	/*
	@Override    //toString메서드가 동작하지 않으면 클래스명,~명, 주소 등이 출력된다.
	public String toString() {
		return studentId + "," + studentName;
	}
	*/
	
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return super.hashCode();
		//return studentId; //손흥민 등번호
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()메서드");
		//return super.equals(obj);
		//st1과 st3의 객체가 가리키는 힙영역의 데이터를 비교하는 구문
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(studentId == std.studentId && studentName.equals(std.studentName))
				return true;
			else
				return false;
		}
		return false;
	}	
}


public class Equals {
	
	
	public static void main(String[] args) {
	
		Student st1 = new Student(7,"손흥민");
		Student st2 = st1;  // 객체에 주소대입
		
		Student st3 = new Student(7,"손흥민");
		// st1과 st3객체의 주소는 다르다. 
		
		/*
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		// st1=st2, st3눈 주소가 다르지만 들어있는 데이터는 같다. 데이터로 같게 처리해보자
		*/
		// 객체가 동일한지 비교될 때 내부적으로 Object클래스 equals()와 hashCode()가 사용된다.  
		//7, "손흥민" 데이터가 같다면 동일한 객체로 인식되게 하자. 
		//그러기 위해, Object클래스 equals()와 hashCode() 재정의를 해야 동일한 객체로 만들 수 있다.
		
		//주소비교
		if(st1 == st2) {
			System.out.println("st1과 st2는 주소가 같습니다.");
		}else {
			System.out.println("st1과 st2는 주소가 같지 않습니다.");
		}
		//객체가 저장하고 있는 데이터관점으로 비교. equals()메서드
		if(st1.equals(st2)) {
			System.out.println("st1과 st2는 주소가 같습니다.");
		}else { 
			System.out.println("st1과 st2는 주소가 같지 않습니다.");
		}
		
		System.out.println("============================");
		
		//주소비교
		if(st1 == st3) {
			System.out.println("st1과 st3는 주소가 같습니다.");
		}else {
			System.out.println("st1과 st3는 주소가 같지 않습니다.");
		}
		// equals()메서드 : Object 클래스에서도 주소값으로 비교. > 재정의가 가능함 > 순수데이터로만 비교하도록 재정의 해보겠다. (st1=st2=st3로 만들어 보겠다)
		//Object 클래스에서도 주소값으로 비교하지 말고 객체가 참조하는 힙영역의 데이터로 비교하여 
		//equals 를 재정의 하지 않으면 주소값으로 비교하므로 flase가 출력 될 것이다.
		if(st1.equals(st3)) {
			System.out.println("st1과 st3는 동일하다.");
		}else { 
			System.out.println("st1과 st3는 동일하지 않습니다.");
		}
		
		System.out.println("===============");
		//정리
		//객체비교시 내부적으로 Object 클래스의 equals(), hashCode() 메서드가가 동작된다. (주솟값으로 비교)
		//객체가 참조하는 있는 힙영역의 데이터로 비교하도록, equals(), hashCode() 메서드를 재정의하자.
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		System.out.println("===============");
		
		// 해쉬코드값: 힙영역의 기억장소를 가리킬 때 사용하는 코드값.
		System.out.println(st1.hashCode());  //1694819250
		System.out.println(st2.hashCode());  //1694819250
		System.out.println(st3.hashCode());  //1365202186
		
		
		
	}
}
