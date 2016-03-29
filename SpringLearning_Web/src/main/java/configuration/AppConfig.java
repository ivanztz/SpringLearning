package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import component.CustomMessageProvider;
import component.HelloWorldMessageProvider;
import component.MessageProvider;
import component.MessageSender;

@Configuration
@Profile("Test")
public class AppConfig {
	
	@Bean(name="sender")
	public MessageSender sender(){
		return new MessageSender(csProvider());
	}
	
	@Bean(name="hwProvider")
	public MessageProvider hwProvider(){
		return new HelloWorldMessageProvider();
	}
	
	@Bean(name="csProvider")
	public MessageProvider csProvider(){
		return new CustomMessageProvider("Hellow from custom provider (Java configuration)");
	}
}
