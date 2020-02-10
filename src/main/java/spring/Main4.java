package spring;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main4 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext3.xml");
		
		Calculator cal = ctx.getBean("calculator1", Calculator.class);
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		if(a.equals("+")) {
			System.out.println(cal.add(sc.nextInt(), sc.nextInt()));
		}else if(a.equals("-")) {
			System.out.println(cal.sub(sc.nextInt(), sc.nextInt()));
		}else if(a.equals("*")) {
			System.out.println(cal.div(sc.nextInt(), sc.nextInt()));
		}else if(a.equals("/")) {
			System.out.println(cal.multi(sc.nextInt(), sc.nextInt()));
		}
		
		ctx.close();//기본적으로 싱글톤 패턴 적용
	}
}
