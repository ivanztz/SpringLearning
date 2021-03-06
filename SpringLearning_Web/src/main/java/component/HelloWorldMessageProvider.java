package component;

import java.lang.annotation.Repeatable;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//Service name for annotation configuration
@Service("hwProvider")
//Primary definition for autowiring
@Primary
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!!!";
	}

	@Override
	public void init() {
		System.out.println(this.getClass().getName() + "bean initialized");
	}

}
