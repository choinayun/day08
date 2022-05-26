package day08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 문자열 만드는 새로운 방법 
		String str = new String("abcdefg"); 
		// String str = "abcdefg";
		
		/*
		System.out.println("문자열 입력");
		
		str = input.next();
		System.out.println(str);
		
		// 소문자 -> 대문자 
		System.out.println( str.toUpperCase() );
		*/
		
		// abcdefg 에서 0번째 값 출력 (문자 한개만)
		System.out.println( str.charAt(0) );
		System.out.println(str.charAt(0)=='a'); //문자 하나만 처리할 때는 ''사용
	    System.out.println(str.charAt(1)=='a');
	      
	    System.out.println(str.charAt(0)-32);
	    System.out.println((char)(str.charAt(0)-32));
	      
	    str+=" ";
	    str+="z";
	    System.out.println(str);
	         
	    str = "   aaaa aaa aaa  ";
	    System.out.println(str);
	      
	    String re = str.trim(); //trim() 공백 제거
	    System.out.println(re);
		
	    
		// trim () : 
		/*
	    if(name.trim().equals("홍길동")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다 !");
		}
		*/
	    
		String addr;
		addr = "047869 /서울시 종로구 종로3가 /3층 ";
		
		// 해당하는 값을 어떤 값으로 자르겠냐는 뜼 
		String[] ad = addr.split("  ");
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		System.out.println(ad[2]);
		
		// replace : 특정 문자로 바꿔주는
		String replace = addr.replace("/", ",");
		System.out.println( replace);
		
	}
}










