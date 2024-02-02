package in.ineuron.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.PersonalInfo;

public class TestApp {
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("**********CONTAINER STARTED**************");
		
		System.in.read();
		PersonalInfo personalInfo = factory.getBean("pinfo", PersonalInfo.class);
		System.out.println(personalInfo);
		factory.close();
		
		System.out.println("************CONTAINER STOPPED************");
	}

}
