package day08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// ���ڿ� ����� ���ο� ��� 
		String str = new String("abcdefg"); 
		// String str = "abcdefg";
		
		/*
		System.out.println("���ڿ� �Է�");
		
		str = input.next();
		System.out.println(str);
		
		// �ҹ��� -> �빮�� 
		System.out.println( str.toUpperCase() );
		*/
		
		// abcdefg ���� 0��° �� ��� (���� �Ѱ���)
		System.out.println( str.charAt(0) );
		System.out.println(str.charAt(0)=='a'); //���� �ϳ��� ó���� ���� ''���
	    System.out.println(str.charAt(1)=='a');
	      
	    System.out.println(str.charAt(0)-32);
	    System.out.println((char)(str.charAt(0)-32));
	      
	    str+=" ";
	    str+="z";
	    System.out.println(str);
	         
	    str = "   aaaa aaa aaa  ";
	    System.out.println(str);
	      
	    String re = str.trim(); //trim() ���� ����
	    System.out.println(re);
		
	    
		// trim () : 
		/*
	    if(name.trim().equals("ȫ�浿")) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ��� !");
		}
		*/
	    
		String addr;
		addr = "047869 /����� ���α� ����3�� /3�� ";
		
		// �ش��ϴ� ���� � ������ �ڸ��ڳĴ� �� 
		String[] ad = addr.split("  ");
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		System.out.println(ad[2]);
		
		// replace : Ư�� ���ڷ� �ٲ��ִ�
		String replace = addr.replace("/", ",");
		System.out.println( replace);
		
	}
}










