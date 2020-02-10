package spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Greeter g = ctx.getBean("greeter",Greeter.class);
		String msg = g.greet("Spring!");
		System.out.println(msg);
		ctx.close();
	}
}
