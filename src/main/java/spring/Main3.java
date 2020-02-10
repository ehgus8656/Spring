package spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main3 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext2.xml");
		
		Greeter g1 = ctx.getBean("greeter1",Greeter.class);
		System.out.println(g1.greet("123"));
		Greeter g2 = ctx.getBean("greeter2",Greeter.class);
		System.out.println(g2.greet("124"));
		System.out.println(g1 == g2);
		ctx.close();//기본적으로 싱글톤 패턴 적용
	}
}
