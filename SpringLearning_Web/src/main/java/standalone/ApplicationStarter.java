package standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import component.MessageSender;

public class ApplicationStarter {

	public static void main(String[] args) {

		// initializing context
		ApplicationContext context = getXMLBasedContext();
		//ApplicationContext context = getAnnotationBasedContext();
		//ApplicationContext context = getJavaBasedContext();

		// getting bean
		MessageSender sender = context.getBean("sender", MessageSender.class);

		// working with bean
		sender.send();

	}

	@SuppressWarnings("unused")
	private static ApplicationContext getXMLBasedContext() {
		return new ClassPathXmlApplicationContext("configuration/application-xml.xml");
	}

	@SuppressWarnings("unused")
	private static ApplicationContext getAnnotationBasedContext() {
		return new ClassPathXmlApplicationContext("configuration/application-annotation.xml");
	}

	@SuppressWarnings("unused")
	private static ApplicationContext getJavaBasedContext() {
		return new AnnotationConfigApplicationContext(configuration.AppConfig.class);
	}

}
